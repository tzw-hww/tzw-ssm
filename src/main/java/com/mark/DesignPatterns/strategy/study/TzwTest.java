package com.mark.DesignPatterns.strategy.study;

public class TzwTest {


    public static void main(String[] args) {
        Shangke shangke = new Shangke();

        shangke.teach(new MathTeacher("数学老师"));
    }

}
