package com.tedu.cn;

import com.tedu.cn.ob.ObjectDemo;
import com.tedu.cn.ob.Person;
import org.omg.CORBA.Object;

public class Driver {
    public static void main(String[] args) {
        Person person1=new Person("霍文静",20,148,'女',78);
        Person person2=new Person("霍文静",20,148,'女',78);
        System.out.println(person1.equals(person2));
        System.out.println(person1==person2);
    }


}
