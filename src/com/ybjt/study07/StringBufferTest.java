package com.ybjt.study07;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zxh
 * @create 2019-11-13 16:59
 */
public class StringBufferTest {

    @Test
    public void Test1(){
        String str = null;
        StringBuilder s = new StringBuilder();
        s.append(str);
        System.out.println(s.length());
        System.out.println(s);
    }

    @Test
    public void test2(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        String str = format.format(date);
        System.out.println(str);
        try {
            format.parse("2020-11-13 08:52:46");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        instance.set(Calendar.DAY_OF_MONTH,26);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.getTime());
        instance.setTime(new Date());
        int i = instance.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);
    }

}
