package com.mark.DesignPatterns.builder;

public class Main {

    public static void main(String[] args) {


        Person person = new Person.PersionBuilder().getPerson1(11, "张三", "男")
                .getPerson2(168)
                .getPerson3(60)
                .getPerson4("管庄","北京市").build();

        System.out.println(person);


    }
}
