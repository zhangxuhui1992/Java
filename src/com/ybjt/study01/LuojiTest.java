package com.ybjt.study01;

/**
 * 逻辑运算符：操作boolean类型的变量
 * & 逻辑与   | 逻辑或  ! 逻辑非
 * && 短路与   || 短路或    ^ 异或
 * @author zxh
 * @create 2019-08-30 13:03
 */
public class LuojiTest {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);//false
        System.out.println(b1&&b2);//false
        System.out.println(!b2);//true
    }
}
