package com.mark.DesignPatterns.iterator.v2;


public class Main {

    public static void main(String[] args) {

//        ArrayList_ arrayList_ = new ArrayList_();
//        for(int i= 0;i<15;i++){
//            arrayList_.add("s"+i);
//        }
//        System.out.println(arrayList_.size());
//
//
//        Iterator iterator = arrayList_.getIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        LinkList_ linkList_ = new LinkList_();
        for(int i= 0;i<15;i++){
            linkList_.add("s"+i);
        }
        System.out.println(linkList_.size());

        Iterator iterator = linkList_.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
