package com.tedu.cn;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    @Test
    public void m1(){
        //获取日历对象
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.getTime());
    }
    @Test
    public void m2(){
        Date date=new Date();
        System.out.println(date);
        //返回1970年1月1日 00点到现在的毫秒数
        System.out.println(date.getTime());
        Date d1=new Date(1575428099550L);
        System.out.println(d1);
        System.out.println(d1+"*****");
        System.out.println(d1.before(date));

    }

    /**
     * 测试日期格式化
     */
    public void m3(){
        //将具体的日期转化为字符串format
        SimpleDateFormat  format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = format.format(new Date());
        System.out.println(date);

    }

    @Test
    public void m4() throws ParseException {
        //字符串转日期用parse
        String date="2019.102.04";
        SimpleDateFormat format =new SimpleDateFormat("yyyy.MM.dd");
        Date d =format.parse(date);
        System.out.println(d);
}

}
