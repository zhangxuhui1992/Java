package com.ybjt.study07;

import java.util.Date;

/**
 * @author zxh
 * @create 2019-11-13 16:00
 */
public class TimeTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());//Wed Nov 13 16:14:34 CST 2019
        System.out.println(d.getTime());//毫秒数

        Date date = new Date(456123354l);
        System.out.println(date.toString());

        java.sql.Date d2 = new java.sql.Date(date.getTime());
        System.out.println(d2.getTime());

    }
}
