package com.mark.java.exception;

public class ExceptionDemo2 {

    public static void show(){
        try{
            int a = 1/0;
        }catch (Exception e){
            System.exit(1);
        }finally {
            System.out.println("finally");
        }
        System.out.println("aaaaa");
    }


    public static void main(String[] args) {
        ExceptionDemo2.show();
    }
}



