package com.mark.java.exception;

public class ExcepDemo {

    public static void show(){
        try{
            int a = 1/0;
        }catch (Exception e){
            System.exit(1);
        }finally {
            System.out.println("finally");
        }
    }

}
