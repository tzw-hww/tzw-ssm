package com.mark.java.io.study;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {

        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream("dataout.txt"));
            inputStream = new DataInputStream(new FileInputStream("dataout.txt"));

            outputStream.writeUTF("我爱中国123213214ture,顺丰到付的ddd");
            outputStream.writeBoolean(1==1);
            outputStream.writeInt(11111);
            outputStream.flush();

            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.read());
            System.out.println(inputStream.read());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
