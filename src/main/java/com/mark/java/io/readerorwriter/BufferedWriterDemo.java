package com.mark.java.io.readerorwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter writer=null;
        try {
            writer = new BufferedWriter(new FileWriter("writer.txt"));
            writer.write("adfdsfdsfsdafdsfsd");
            writer.newLine();
            writer.write("adfdsfdsfsdafdsfsd5555555");
            writer.flush();
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
