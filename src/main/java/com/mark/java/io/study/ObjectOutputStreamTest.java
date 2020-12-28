package com.mark.java.io.study;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {

        ObjectOutputStream objectInputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("per.txt");
            objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(new Person("zhangsan",24,"20200901"));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
