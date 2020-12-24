package com.mark.java.tcp.socket.demo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class JpgServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(11111);
        Socket accept = serverSocket.accept();
        //获取输入流，接收发送端消息，从socket中取数据
        InputStream inputStream = accept.getInputStream();
        //将接收到的数据写入输出流，当前程序输出到文件中
        FileOutputStream fileOutputStream = new FileOutputStream("pic.jpg");
        int temp = 0;
        while ((temp=inputStream.read())!=-1){
            fileOutputStream.write(temp);
        }
        accept.shutdownInput();

        //获取输出流，发送响应信息
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("图片上传成功".getBytes("UTF-8"));
        accept.shutdownOutput();

        outputStream.close();
        inputStream.close();
        fileOutputStream.close();
        accept.close();
        serverSocket.close();

    }
}
