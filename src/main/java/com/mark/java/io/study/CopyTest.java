package com.mark.java.io.study;

import java.io.*;

public class CopyTest {

    public static void main(String[] args) {
        File src = new File("abc.txt");
        File desc = new File("d.txt");

        InputStream inputStream = null;
        OutputStream outputStream=null;
        try {
            inputStream = new FileInputStream(src);
            outputStream = new FileOutputStream(desc);
            int read = 0;
            while((read = inputStream.read())!=-1){
                outputStream.write(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
