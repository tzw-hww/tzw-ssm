package com.mark.java.tcp.socket.demo4_thread;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class UserClient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",22222);
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream) ;
        objectOutputStream.writeObject(getUser());

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);


        dataInputStream.close();
        inputStream.close();
        objectOutputStream.close();
        objectOutputStream.close();
        socket.close();



    }

    public static User getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        User user = new User(username,password);
        return user;
    }
}
