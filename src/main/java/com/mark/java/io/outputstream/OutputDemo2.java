package com.mark.java.io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputDemo2 {

    public static void main(String[] args) {


        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("123.txt");
            outputStream.write("0123456789".getBytes(),2,5);
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
