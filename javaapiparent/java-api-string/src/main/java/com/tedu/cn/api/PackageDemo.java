package com.tedu.cn.api;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

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

    /**
     * java异常体系
     * 异常：程序不正常的退出
     * java语言的异常分为两种
     * 1）Error
     *   硬件故障引起的（磁盘损坏，内存空间不足，断电）
     * 2)Exception
     *   是由于java程序出的异常
     *      该异常又分为两种：
     *         1、编译时异常
     *         2、运行时异常
     */

    /**
     * 测试Exception异常
     * 处理的两种方法
     * 1）通过thorws关键字(抛出)显示抛出（方法的屁股后面添加thorw类型），抛给方法的调用者
     * 2）通过try catch语句
     * 进行显示的捕获
     */
    @Test
    public void m2(){
        try {
            min();
        } catch (FileNotFoundException e) {
            System.out.println("出现异常");
            //e.printStackTrace(); 这是异常栈
        }
    }
    public static void min() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("tts.txt");
    }




}
