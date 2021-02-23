package com.mark.java.collection;

public class Person implements Comparable{

    String personName;
    String personAge;

    public Person(String personName, String personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public Person(){

    }
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        if(p.personName.length()>this.personName.length()){
            return 1;
        }else if(p.personName.length()>this.personName.length()){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge='" + personAge + '\'' +
                '}';
    }
}
