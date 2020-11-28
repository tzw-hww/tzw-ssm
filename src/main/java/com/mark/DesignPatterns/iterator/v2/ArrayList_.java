package com.mark.DesignPatterns.iterator.v2;

/**
 * 利用数据实现ArrayList
 */
public class ArrayList_ implements Collection_{


    //初始化容器
    private Object[] objs = new Object[10];
    private int index = 0;

    public void add(Object o){

        if(index==objs.length){
            Object[] newObjects = new Object[objs.length*2];
            System.arraycopy(objs,0,newObjects,0,objs.length);
            objs=newObjects;
        }

        objs[index] = o;
        index++;
    }

    public int size(){
        return index;
    }


    public Object get(int index){
        return objs[index];
    }


    public Iterator getIterator(){

        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator{

        private  int i = 0;

        @Override
        public boolean hasNext() {
            if(i==size()){
                return false;
            }
            i++;
            return true;
        }

        @Override
        public Object next() {

            return objs[i-1];
        }
    }




}
