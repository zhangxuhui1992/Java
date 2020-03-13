package com.re;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-03 18:59
 */
public class MyWife {

    private String name;

    protected String age;

    String country;

    public User son = new User("张旭辉", 18);

    protected void toMarryed(){
        System.out.println("结婚");
    }
}
