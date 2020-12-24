package com.mark.java.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {


    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");
        //判断文件是否存在
        if (!file.exists()){
            //创建文件
            file.createNewFile();
        }

        //判断文件的可读，可写，可执行的权限属性
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        //获取文件名称
        System.out.println(file.getName());
        //获取文件的绝对路径，返回值为File
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
        //获取文件的绝对路径,返回值为String
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径名称，如果文件的路径中只包含文件名称，则显示空
        String parent = file.getParent();
        System.out.println(parent);
        //获取文件的父路径名称，如果文件的路径中只包含文件名称，则显示空
        File parentFile = file.getParentFile();
        System.out.println(parentFile);
        //返回文件绝对路径的规范格式
        String canonicalPath = file.getCanonicalPath();
        System.out.println(canonicalPath);
        //返回文件绝对路径的规范格式
        File canonicalFile = file.getCanonicalFile();
        System.out.println(canonicalFile);
        //返回操作系统的文件分割符
        System.out.println(File.separator);


        System.out.println("------------目录------------------");
        //目录
        File file1 = new File("E:/a/b/c");
        //该路径可以打印，跟实际存不存在该目录没有关系
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);
        //判断是否为目录（注意当没有该目录的时候判断为false
        System.out.println(file1.isDirectory());
        //判断是否为文件
        System.out.println(file1.isFile());


        if(!file1.exists()){
            //创建多级目录
            file1.mkdirs();
            //创建一级目录
            file1.mkdir();
        }
        //判断是否为目录（注意当没有该目录的时候判断为false）
        System.out.println(file1.isDirectory());


        System.out.println("-------------文件遍历-----------------");

        File fileDemo = new File("E:/Youdao");
//        String[] list = fileDemo.list();
//        for (int i = 0; i <list.length ; i++) {
//            System.out.println(list[i]);
//        }

//        File[] files = fileDemo.listFiles();
//        for (File fileOne:files) {
//            System.out.println(fileOne.getName());
//        }
        //打印当前文件系统的所有盘符（C盘  D盘）
        File[] files1 = File.listRoots();
        for(int i = 0;i<files1.length;i++){
            System.out.println(files1[i]);
        }
        //递归打印目录下所有的文件
        getFile(fileDemo);
    }

    public static void getFile(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File fileOne:files) {
                getFile(fileOne);
            }
        }else{
            System.out.println(file.getAbsolutePath());
        }
    }


}
