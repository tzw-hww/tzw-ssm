package com.mark.DesignPatterns.iterator.v1;

public class Main {

    public static void main(String[] args) {
//        ArrayList_ arrayList_ = new ArrayList_();
//        for(int i= 0;i<15;i++){
//            arrayList_.add("s"+i);
//        }
//        System.out.println(arrayList_.size());
//
//
//        for (int i = 0; i <arrayList_.size() ; i++) {
//            Object o = arrayList_.get(i);
//            System.out.println(o);
//        }



        LinkList_ linkList_ = new LinkList_();
        for(int i= 0;i<15;i++){
            linkList_.add("s"+i);
        }
        System.out.println(linkList_.size());


        for (int i = 0; i <linkList_.size() ; i++) {
            Object o = linkList_.get(i);
            System.out.println(o);
        }

    }




}
