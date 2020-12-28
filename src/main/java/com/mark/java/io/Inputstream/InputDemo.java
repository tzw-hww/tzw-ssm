package com.mark.java.io.Inputstream;

import java.io.*;

public class InputDemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int read = 0;
            while((read = inputStream.read())!=-1){
                System.out.println((char)read);
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
