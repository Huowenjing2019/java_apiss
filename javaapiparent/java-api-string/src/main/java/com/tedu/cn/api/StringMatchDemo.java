package com.tedu.cn.api;


import org.junit.Test;

import java.util.Scanner;

public class StringMatchDemo {
    @Test
    /**
     *基本匹配规则
     * [a-z]表示a到z中的任何一个字符
     * [0-9]表示0-9中的任意一个数字
     * [A-Z]表示A-Z中的任何一个字符
     */
    public void m1(){
        String regex="[a-z]";
        System.out.println("a".matches(regex));
        regex="[a-zA-Z0-9]";
        System.out.println("0".matches(regex));
        //^是非的意思
        regex="[^(a-zA-Z0-9)]";
        System.out.println("-".matches(regex));
    }

    /**
     * 测试预定义字符集
     */
    @Test
    public void m2(){
        /**
         * .表示任意一字符
         * \d表示任意一个数字，相当于[0-9]
         * \w表示任意一个单词字符，相当于[0-9a-zA-Z_]中任意一个
         * \s表示任意一个字符
         * \D任意一个数字字符
         * \W任意一个非单词字符
         * \S任意一个非空白字符
         */
        /**
         * 数量词
         * X?  表示前面的X出现0次或1次
         * X+  表示前面的X出现1次或多次
         * X*  表示前面的X出现0次或多次
         * X{n}表示前面的X刚好出现n次
         * X{n,}表示前面的X至少出现n次
         * X{m,n}表示前面的X出现m次到n次之间，包括n
         */
        String reg="\\d";
        System.out.println("9".matches(reg));
        System.out.println("98".matches(reg));//false因为超过一个字符
        reg="\\d+";
        System.out.println("98".matches(reg));//Ture
        reg="\\d*";
        System.out.println("98".matches(reg));//Ture
        reg="\\d?";//0次或一次
        System.out.println("98".matches(reg));//false
        System.out.println("9".matches(reg));//Ture
        reg="\\d{5}";
        System.out.println("88885".matches(reg));//Ture
        System.out.println("8520364".matches(reg));//false

        reg="\\d{5,}";
        System.out.println("88885".matches(reg));//Ture
        System.out.println("8520364".matches(reg));//Ture
        reg="\\d{6,8}";
        System.out.println("88885".matches(reg));//Ture
        System.out.println("852036".matches(reg));//Ture
        System.out.println("8520361656".matches(reg));//flase
        reg="\\D";//任意一个非数字字符
        System.out.println("abc2".matches(reg));//flase
        System.out.println("abc".matches(reg));//flase
        System.out.println("123".matches(reg));//flase
        System.out.println("a".matches(reg)); //Ture

    }

    /**
     * 匹配手机号码
     */
    @Test
    public void m3(){

        String regex="(\\+86)?\\s?\\d{11}";
        String phone="15285024132";
        //Scanner scanner=new Scanner(System.in);
        if(phone.matches(regex)){
            System.out.println("手机号合法");
        }else{
            System.out.println("手机号非法");
        }
        //scanner.close();关闭流 流是用来读取数据的，像水管吸水打开留
    }

}
