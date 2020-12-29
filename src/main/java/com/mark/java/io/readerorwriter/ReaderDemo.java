package com.mark.java.io.readerorwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("writer.txt");
            int read = 0;
            while((read = reader.read())!=-1){
                System.out.print((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
