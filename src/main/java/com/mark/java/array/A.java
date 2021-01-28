package com.mark.java.array;

import java.util.Arrays;
import java.util.List;

public class A {

    public static void main(String[] args) {
        //正确
        int a1[] = new int[]{1,2,3};

        //错误,这是错误的，创建对象和赋值必须在一个语句中完成
        int b1[] = new int[3];
//        b = {1,2,3};

        //数组的复制
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[3];
        //从数组a的0位置开始，复制到b数组，从b数组的0位置开始，复制length长度。
        System.arraycopy(a,0,b,2,1);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"\t");
        }
        System.out.println();
        //arrays
        int arr[] = new int[]{4,9,6,3,6,7};

        //toString
        String string = Arrays.toString(arr);
        System.out.println(string);

        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //转list
        List<int[]> ints = Arrays.asList(arr);

        //复制数组,实质还是调用了System.arraycope方法
        int[] ints1 = Arrays.copyOf(arr, 2 * arr.length);
        System.out.println(Arrays.toString(ints1));

        //equals
        int m[] = new int[]{1,2,3};
        int n[] = new int[]{1,2,3};
        boolean equals = Arrays.equals(m, n);
        System.out.println(equals);

        //full,将指定的int值（5），分配到数组c中的每个位置上
        int[] c = new int[5];
        Arrays.fill(c,5);
        System.out.println(Arrays.toString(c));


    }

}
