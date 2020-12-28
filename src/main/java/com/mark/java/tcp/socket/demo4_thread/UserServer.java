package com.mark.java.tcp.socket.demo4_thread;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(22222);
        while(true){
            Socket socket = serverSocket.accept();
            new Thread(new LoginTest(socket)).start();
        }
    }
}
