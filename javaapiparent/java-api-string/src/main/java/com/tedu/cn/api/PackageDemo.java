package com.tedu.cn.api;

import org.junit.Test;

public class PackageDemo {
    @Test
    public void m1(){
        /**
         * 包装类：
         * 以前数据类型：引用数据类型，基本数据类型8种
         *  int a=0;基本数据类型是变量，不是对象要想访问他就要包装类
         *  JAVA语言为每一种基本数据类型都提供了包装类，映射如下：
         *  byte   ----Byte
         *  short  ----Short
         *  int    ----Integer
         *  long   ----Long
         *  double ----Double
         *  float  ----Float
         *  char   ----Character
         *  boolean ----Boolean
         *  这些对应的包装类，都实现了一个接口叫做Serlizable接口（可序列化接口)
         *  表示这些类能够进行序列化和反序列化
         *  接口：抽象化和常量
         */
        int a=0;// 不是对象
        Integer b=0;//是对象，就可以对像名.
        System.out.println(Integer.MAX_VALUE);

        byte b0=1;
        Byte b1=new Byte(b0);  //这就是一个对象
        System.out.println(Byte.MAX_VALUE);
        Integer i=1;//相当于int i = 1;
        System.out.println(Integer.toHexString(15));//转化为16进制
        //尝试调用Integer类的toOctorAPI
        //看源码 Struts2 ---->SpringMVC-----dwr
        Integer c=5;//Integer是方法名，c是对象名
        System.out.println(Integer.toOctalString(15));//8进制
        System.out.println(Integer.toBinaryString(15));//2进制
    }




}
