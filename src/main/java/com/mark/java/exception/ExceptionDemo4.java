package com.mark.java.exception;


import java.util.Scanner;

public class ExceptionDemo4 extends RuntimeException {

    public ExceptionDemo4(String code, String message, String... arg) {
        String format = String.format("错误码为%s,报错信息为%s", code, message);
        String a = "";
        for (int i = 0; i < arg.length; i++) {
            a+=","+arg[i];
        }
        String b = "";
        System.out.println(b=a.substring(1));
        String replace = format.replace("%s", b);
        replace=replace+",参数列表为"+b;
        System.out.println(replace);
    }
}


class A{

    public static void show(){
        int i = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            i =scanner.nextInt();
            int a = 1/i;
        } catch (Exception e) {
            throw new ExceptionDemo4("aaaa","除数不能为%s",String.valueOf(i),"sss");
        }

    }


    public static void main(String[] args) {
        show();
    }
}