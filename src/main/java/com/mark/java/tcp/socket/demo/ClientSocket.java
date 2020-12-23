package com.mark.java.tcp.socket.demo;

import java.io.*;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) throws IOException {

        Socket client = new Socket("127.0.0.1",11111);
        //获取输出流，写发信息
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("hello java");

        //获取输入流，获取响应信息
        InputStream inputStream = client.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);

        inputStream.close();
        dataInputStream.close();
        dataOutputStream.close();
        outputStream.close();
        client.close();
    }
}
