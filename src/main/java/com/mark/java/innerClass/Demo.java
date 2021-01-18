package com.mark.java.innerClass;

public class Demo {

    public Demo(){

    }

    public Demo(String name){
        this.name=name;
    }

    private String name;

    public static int age =10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println("我是Demo");
    }

    class DemoInner{

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void showInner(){
            System.out.println("我是InnerDemo");
        }

        public void show(){
            System.out.println("我是和外部类同名的方法show");
        }

        public void test(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Demo.this.name);
            Demo.this.show();
            System.out.println(age);
        }
        public DemoInner(){
        }
        public DemoInner(String name){

        }
    }


    {
        class A{
            public String a;

            public String getA() {
                return a;
            }

            public void setA(String a) {
                this.a = a;
            }

            public void a(){
                System.out.println("aaaa");
            }
        }
    }
}
