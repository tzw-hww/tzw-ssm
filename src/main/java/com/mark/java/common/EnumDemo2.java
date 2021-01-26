package com.mark.java.common;

public enum  EnumDemo2 {

    A("01","哈哈"),
    B("02","呵呵");

    private String code;
    private String value;

    private EnumDemo2(String code,String value){
        this.code=code;
        this.value=value;
    }

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
}

class A{
    public static void main(String[] args) {
        String value = EnumDemo2.A.getValue();

    }
}

