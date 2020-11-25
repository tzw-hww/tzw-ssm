package com.mark.DesignPatterns.builder;

public class Person {

    private int age;
    private String name ;
    private String sex;
    private int height;
    private int weight;
    private Location loc;


    private Person(){}

    public static class PersionBuilder{
        Person person = new Person();

        public PersionBuilder getPerson1(int age,String name,String sex){
            person.setAge(age);
            person.setName(name);
            person.setSex(sex);
            return this;
        }


        public PersionBuilder getPerson2(int height){
            person.setHeight(height);
            return this;
        }

        public PersionBuilder getPerson3(int weight){
            person.setWeight(weight);
            return this;
        }


        public PersionBuilder getPerson4(String addr,String city){

            Location location = new Location();
            location.setAddr(addr);
            location.setCity(city);
            person.setLoc(location);
            return this;
        }

        public Person build(){
            return  person;
        }

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", loc=" + loc +
                '}';
    }
}

class Location{

    private String addr;
    private String city;


    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "addr='" + addr + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}