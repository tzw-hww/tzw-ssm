package com.mark.java.array;

public class A {

    public static void main(String[] args) {
        //正确
        int a[] = new int[]{1,2,3};

        //错误,这是错误的，创建对象和赋值必须在一个语句中完成
        int b[] = new int[3];
//        b = {1,2,3};
    }

}
