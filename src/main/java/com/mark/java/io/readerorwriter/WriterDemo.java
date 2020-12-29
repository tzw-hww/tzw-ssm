package com.mark.java.io.readerorwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        Writer writer=null;
        try {
            writer = new FileWriter("writer.txt");
            writer.write(99);
            writer.write("功夫熊猫");
            writer.write("123213213",2,4);
            char[] chars = "sdafdsfdsfsd ".toCharArray();
            writer.write(chars,2,5);
            writer.flush();
            writer.append('s');
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
