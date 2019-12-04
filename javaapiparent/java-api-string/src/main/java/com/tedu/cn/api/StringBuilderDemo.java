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
}
