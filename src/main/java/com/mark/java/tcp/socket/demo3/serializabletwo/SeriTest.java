package com.mark.java.tcp.socket.demo3.serializabletwo;

import com.mark.java.tcp.socket.demo3.serializableone.Person;

import java.io.*;

public class SeriTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream inputStream = new FileInputStream("person.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Object o = objectInputStream.readObject();

        Person p = (Person) o;

        System.out.println(p.toString()+"--------------------");

        objectInputStream.close();
        inputStream.close();




    }

}
