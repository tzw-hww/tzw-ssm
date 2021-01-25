package com.mark.java.base.fengzhuang.packtwo;

import com.mark.java.base.fengzhuang.packone.Demo;

public class DemoCh extends Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.d);
        DemoCh demoCh = new DemoCh();
        System.out.println(demoCh.c);
        System.out.println(demoCh.d);

    }

    public void test(){
        Demo demo = new Demo();
        System.out.println(demo.d);
    }
}
