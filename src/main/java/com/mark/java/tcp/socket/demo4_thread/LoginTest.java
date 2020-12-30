package com.mark.java.tcp.socket.demo4_thread;

import lombok.SneakyThrows;

import java.io.*;
import java.net.Socket;

public class LoginTest implements Runnable {


    private Socket scocket;

    public LoginTest(Socket scocket) {
        this.scocket = scocket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        DataOutputStream dataOutputStream;
        try {
            inputStream = scocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            User user= (User) objectInputStream.readObject();
            String passWord = user.getPassWord();
            String userName = user.getUserName();
            System.out.println("-------------------------------");
            try (OutputStream outputStream = scocket.getOutputStream()) {
                dataOutputStream = new DataOutputStream(outputStream);
            }
            String retStr = "";
            if("张三".equals(userName)&&"123456".equals(passWord)){
                retStr = "登录成功";
                dataOutputStream.writeUTF(retStr);
                System.out.println("登录成功");
            }else{
                retStr = "登录失败";
                dataOutputStream.writeUTF(retStr);
                System.out.println("登录失败");
            }
            dataOutputStream.close();
            objectInputStream.close();
            scocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }


    }
}
