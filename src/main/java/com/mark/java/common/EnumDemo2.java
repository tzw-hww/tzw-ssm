package com.mark.java.common;

public enum  EnumDemo2 {

    //枚举，可以当成该枚举类的实例对象。
    //相当于public static final 修饰，直接用类名进行调用
    A("01","哈哈"),
    B("02","呵呵");

    //属性
    private String code;
    private String value;

    //构造方法
    private EnumDemo2(String code,String value){
        this.code=code;
        this.value=value;
    }

    //get set 方法
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //普通方法
    //提供了values方法，能将枚举类中的枚举值转成数组。
    public static void show(){
        EnumDemo2[] values = EnumDemo2.values();
        for (EnumDemo2 enumDemo2 : values) {
            System.out.println(enumDemo2.name());
        }
    }
    //根据code获取value值
    public static String getValueByCode(String code){

        EnumDemo2[] values = EnumDemo2.values();
        for (EnumDemo2 enumDemo2 : values) {
            if(enumDemo2.getCode().equals(code)){
                return enumDemo2.getValue();
            }
        }
        return null;
    }
}

class A{
    public static void main(String[] args) {
        EnumDemo2.show();
        System.out.println(EnumDemo2.A.getCode()+":"+EnumDemo2.A.getValue());
        String code = EnumDemo2.A.getValue();

        String valueByCode = EnumDemo2.getValueByCode("01");
        System.out.println(valueByCode);
    }
}

