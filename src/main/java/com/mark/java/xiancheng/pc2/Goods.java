package com.mark.java.xiancheng.pc2;

public class Goods {

    private String brand;

    private String name;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }



    public  void set(String brand,String name){

        this.setBrand(brand);
        this.setName(name);
        System.out.println("成产了"+this.getBrand()+"---"+this.getName());
    }
}
