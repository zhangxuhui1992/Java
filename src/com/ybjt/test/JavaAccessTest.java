package com.ybjt.test;

import com.re.MyWife;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-03 19:00
 */
public class JavaAccessTest {
    public static void main(String [] args){
        MyWife wife = new MyWife();
        System.out.println(wife);
        System.out.println(wife.son.getAge());
    }
}
