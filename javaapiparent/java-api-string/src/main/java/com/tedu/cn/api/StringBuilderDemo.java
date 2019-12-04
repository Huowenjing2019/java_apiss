package com.tedu.cn.api;

import org.junit.Test;

public class StringBuilderDemo {
    @Test
    /**
     * 一个可变的字符序列。这个类提供了一个API兼容
     * *带有{@code StringBuffer}
     */
    public void m1(){
        StringBuilder builder=new StringBuilder();
        //append方法
        builder.append("i love you ");
        builder.append(2019);
        builder.append(" will be end");
        builder.append("李健勋你这个骗子");
        System.out.println(builder.toString());
    }

    @Test
    public void m2(){
        StringBuilder builder = new StringBuilder("I LOVE YOU!");
        builder.append("2020年");
        builder.append("我不会再和你有任何瓜葛");
        System.out.println(builder.toString());
        //替换
        builder.replace(builder.indexOf("我"),builder.indexOf("瓜葛")+"我".length(),"我喜欢你");
    }

    @Test
    public void tip(){
        /**
         * StringBuilder和StringBuffer的区别
         * StringBuilder是非线程安全的可变字符串类，运行效率较高，
         * 但不能保证线程安全
         * StringBuilder也是一个可变字符串类，但是运行效率较低，线程安全
         */
    }
}
