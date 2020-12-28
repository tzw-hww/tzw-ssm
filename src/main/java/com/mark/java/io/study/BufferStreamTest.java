package com.mark.java.io.study;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class BufferStreamTest {

    public static void main(String[] args) {


        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream("bufin.txt"));
            outputStream = new BufferedOutputStream(new FileOutputStream("bufout.txt"));

            int length = 0;
            byte[] buf = new byte[3];
            while((length=inputStream.read(buf))!=-1){
                System.out.print(new String(buf, 0, length));
                outputStream.write(buf,0,length);
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
