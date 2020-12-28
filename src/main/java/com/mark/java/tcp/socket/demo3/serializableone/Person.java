package com.mark.java.tcp.socket.demo3.serializableone;

import java.io.Serializable;

public class Person implements Serializable {

    private String  personName;
    private int age;
    private String birthday;
    private String aaaaa;


    public Person(String personName, int age, String birthday) {
        this.personName = personName;
        this.age = age;
        this.birthday = birthday;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAaaaa() {
        return aaaaa;
    }

    public void setAaaaa(String aaaaa) {
        this.aaaaa = aaaaa;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", aaaaa='" + aaaaa + '\'' +
                '}';
    }
}
