package com.tedu.cn.ob;

public class ObjectDemo {
    public static void main(String[] args) {
        ObjectDemo od1=new ObjectDemo();
        ObjectDemo od2=new ObjectDemo();
        System.out.println(od1==od2);
        System.out.println(od1.hashCode());
        System.out.println(od2.hashCode());
        System.out.println(od1.equals(od2));


    }



}
