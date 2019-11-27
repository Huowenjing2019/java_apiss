package com.tedu.cn.api;

import org.junit.Test;

public class StringApiDemo {
    /**
     * 创建String对象的方式有两种
     * 1）通过字符串的字面量去创建字符串的对象
     * 2）通过String的构造器去创建对象
     * 注意：String字符串字面量创建出来的对象
     * 会被放入常量池，第二次再次使用String字符串字面量创建
     * 的时候，java会去常量池中查找有没有对象的字符串字面量对象，
     * 如果有，则直接使用，没有则创建并且放入常量池
     * 如果是通过new关键字创建的，那么就会生成一个全新的空间
     */
    @Test
public  void testString001() {
    //测试第一种方式创建String对象
    String str1="abc";
    String str2="abc";
    String str3=new String("abc");// new后面是构造器
        // str3的值放在放在另一个空间
    System.out.println(str1==str2);
    System.out.println(str1==str3);
}
/**
 * 测试字符串对象的trim API的使用
 *
 * f返回去除字符串作用两边的空格的字符串
 */
@Test
    public void testTrim(){
        String str1 ="        8*****8      ";
        System.out.println(str1);
        str1=str1.trim();
        System.out.println(str1);
    }
    /**
     * 将某一个字符串全部转化为大写使用toUpperCase
     * 将某一个字符串全部转化为小写使用ttoLowererCase    2832行
     */
    @Test
    public void testLetterCHG(){
        String str1="i love you";
        str1=str1.toUpperCase();
        System.out.println(str1);
        System.out.println(str1.toLowerCase());//转化为小写


    }
    /**
     * 使用indexOf查找一个字符串某一个字符的索引（下标值 从0开始）
     * 在字符串中第一次出现的索引
     */
    @Test
    public void testIndexOf(){
        String str1="l love,my girl";
        System.out.println(str1.indexOf("m"));
        System.out.println(str1.indexOf("love"));
        /**
         * lastIndexOf表示最后一个字符串在字符串中出现的索引
         */
        System.out.println(str1.lastIndexOf("o"));
    }

}
