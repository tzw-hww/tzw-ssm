package com.mark.java.array;

public class TwoArray {
    public static void main(String[] args) {
        //创建
        int arr[][] = new int[3][];
        //数组中存储数组
        arr[0] = new int[5];
        arr[1] = new int[2];
        arr[2] = new int[3];

        //赋值
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[0][3] = 3;
        arr[0][4] = 4;

        arr[1][0] = 5;
        arr[1][1] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        int[][] arr1 = new int[][]{{1,2},{4,5,6},{7,8,9,0}};





    }








}
