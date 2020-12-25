package com.mark.java.tcp.socket.demo2;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(22222);
        while(true){
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            User user= (User) objectInputStream.readObject();
            String userName = user.getUserName();
            String passWord = user.getPassWord();
            System.out.println("-------------------------------");


            OutputStream outputStream = accept.getOutputStream();
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
        }

//        objectInputStream.close();
//        inputStream.close();
//        accept.close();
//        serverSocket.close();

    }
}
