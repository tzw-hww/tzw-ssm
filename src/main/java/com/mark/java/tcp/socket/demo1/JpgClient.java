package com.mark.java.tcp.socket.demo1;

import java.io.*;
import java.net.Socket;

public class JpgClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",11111);
        //创建图片文件输入流
        FileInputStream fileInputStream = new FileInputStream("img.jpg");
        //获取输出流对象,并写入输出流
        OutputStream outputStream = client.getOutputStream();
        int temp = 0;
        while((temp=fileInputStream.read())!=-1){
            outputStream.write(temp);
        }
        client.shutdownOutput();

        //获取输入流，获取响应信息
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int read = inputStream.read(buf);
        String s = new String(buf, 0, read, "UTF-8");
        System.out.println(s);
        client.shutdownInput();

        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        client.close();

    }
}
