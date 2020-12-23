package com.mark.java.tcp.socket.demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(11111);
        Socket accept = serverSocket.accept();
        //获取输入流，接收发送端消息
        InputStream inputStream = accept.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);

        //获取输出流，发送响应信息
        OutputStream outputStream = accept.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("收到");

        dataOutputStream.close();
        outputStream.close();
        dataInputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
