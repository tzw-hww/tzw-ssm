package com.mark.java.io;

import java.io.*;

public class InputDemo3 {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            //返回读取的长度
            int leagth = 0;
            while((leagth = inputStream.read(bytes,3,5))!=-1){
                System.out.println(new String(bytes,0,leagth));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
