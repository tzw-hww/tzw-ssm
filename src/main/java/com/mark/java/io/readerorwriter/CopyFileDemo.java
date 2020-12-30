package com.mark.java.io.readerorwriter;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("abc.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("copy.txt"));
            String str = "";
            while((str=bufferedReader.readLine())!=null){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
//            int read = 0;
//            while((read=bufferedReader.read())!=-1){
//                bufferedWriter.write(read);
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
