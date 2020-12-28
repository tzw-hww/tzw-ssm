package com.mark.java.io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputDemo1 {

    public static void main(String[] args) {


        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("123.txt");
            outputStream.write(97);
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
        }


    }

}
