package com.mark.java.tcp.socket.demo4_thread;

import lombok.SneakyThrows;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LoginTest implements Runnable {


    private Socket scocket;

    public LoginTest(Socket scocket) {
        this.scocket = scocket;
    }

    @SneakyThrows
    @Override
    public void run() {
        InputStream inputStream = scocket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        User user= (User) objectInputStream.readObject();
        String userName = user.getUserName();
        String passWord = user.getPassWord();
        System.out.println("-------------------------------");


        OutputStream outputStream = scocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
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
    }
}
