package com.mark.java.io.readerorwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new FileReader("writer.txt"));
            int read = 0;
            while((read = bufferedReader.read())!=-1){
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
