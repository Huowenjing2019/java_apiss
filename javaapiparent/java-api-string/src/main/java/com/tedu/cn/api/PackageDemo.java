package com.tedu.cn.api;

import com.tedu.cn.api.ex.PasswordException;
import org.junit.Test;

import java.io.*;

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
     * Alt+enter
     * 2）通过try catch语句
     * Ctrl+alt+t  然后选择6
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

    @Test
    public void mytest(){
        try {
            mytest1();
        } catch (FileNotFoundException e) {
            System.out.println("没有找到,出现异常");
            //e.printStackTrace();
        }
    }
    public static void mytest1() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("YHT.txt");
    }
    @Test
    public void m5(){
        ex();
    }
    public static void ex() {
        try {
            File f=new File("ttx.txt");
            if(!f.exists()){
               f.createNewFile();
           }
            InputStream inputStream = new FileInputStream("JJJ.txt");
            System.out.println(1 / 0);
            String str = null;
            System.out.println(str.lastIndexOf("c"));
        } catch (FileNotFoundException f1) {
            System.out.println("文件未找到");
        } catch (ArithmeticException f2) {
            System.out.println("除数不能为0");
        } catch (NullPointerException f3) {
            System.out.println("出现空指针异常");
        } catch (IOException e) {
            System.out.println("文件读取错误");
            //e.printStackTrace();
        }


    }
    @Test
    public void m6(){
        try {
            autoEx();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void autoEx() throws Exception {
        throw new Exception("我创建的异常");
    }

    /**
     * 运行时异常
     */
    public static void mmm1(){
        RuntimeException r= new RuntimeException("出现运行异常");
        throw r;
    }


    @Test
    public void m8(){
        String psw="2855hsmne";
        if(psw.length()<8){
            throw new PasswordException(2,"密码安全系数不够");
        }
        if(psw.matches("\\d{4,8}&&\\w{4,8}")){
            throw new PasswordException(3,"密码须有数字与字母组成");
        }
        if(!psw.equals("2855hsmne")){
            throw new PasswordException("密码错误");
        }else{
            System.out.println("密码设置成功");
        }
    }
}
