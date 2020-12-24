package com.mark.java.tcp.socket.demo2;

import com.mark.java.tcp.socket.demo2.serveruser.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(22222);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        User user = (User)objectInputStream.readObject();
        System.out.println(user.toString());
        objectInputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
