package com.mark.java.array;

public class SortDemo {


    /**
     * 九九乘法
     */
    public static void table(){

        for (int i = 1;i<10;i++){
            String str = "";
            for(int j=1;j<=i;j++){
                str = str+String.format("%s * %s = %s%s", j, i, i * j,"\t");
            }
            System.out.print(str+"\n");
        }


    }




    /**
     * 冒泡排序
     * 原理：1.从arr[0]开始，比较 arr[t]和arr[t+1] 位置的两个数的大小.
     *       2. 如果 arr[t+1]>arr[t],则交换arr[t] 和 arr[t+1] 位置的值
     *       3. 如果arr[t+1]>arr[t]则不跳过。比较下一个位置。
     *       4. 这样 每比较一圈，就找出一个最大值。所以内圈循环 length-1 此
     *       5. 而外圈需要循环length-1次，如果找到倒数第二大的数，则剩下的一个就是最小的了，所以就不用在循环一遍
     *
     */
    public static void maoPaoSort(int[] arr){

        int count= 0;
        int count1 = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                count++;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    count1 ++;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("\n总循环数"+count);
        System.out.println("交换数"+count1);
    }

    public static void selectSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        System.out.println("------------------冒泡排序----------------------");
        int[] arr = new int[]{8,9,2,6,4,7,1,3,0,5};
        SortDemo.maoPaoSort(arr);

        System.out.println("------------------选择排序----------------------");
        SortDemo.selectSort(arr);


        System.out.println("------------------九九乘法----------------------");
        SortDemo.table();
    }

}
