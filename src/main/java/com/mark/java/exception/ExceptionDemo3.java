package com.mark.java.exception;

import com.tzw.entity.EcifClient;
import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionDemo3 {

    //使用throws，外部调用一定要处理。，要不再次throws,要不try catch处理掉
    public static void show() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("a.txt");
    }
    //使用throw,可以不用处理，不会编译报错
    public static void show2() {
        try {
            int i = 1/0;
        } catch (RuntimeException e) {
            throw new RuntimeException("aa");
        }
    }

    public static void main(String[] args) {
        show2();
        try {
            show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
