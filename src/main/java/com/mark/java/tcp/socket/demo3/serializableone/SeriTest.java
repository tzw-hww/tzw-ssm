package com.mark.java.tcp.socket.demo3.serializableone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeriTest {
    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("person.txt");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Person person = new Person("张三",16,"20001201");
        objectOutputStream.writeObject(person);

        objectOutputStream.close();
        outputStream.close();




    }

}
