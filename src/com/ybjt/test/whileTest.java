package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-07-01 11:08
 */
public class whileTest {
    public static void main(String[] args) {
        //执行时首先执行do里面的内容一次
        int  i = 0;
        do {
            System.out.println("首先执行一次"+i);
            i++;
        }while (i < 10);

        int x = 0;
        while (x<10){
            x++;
            System.out.println("java" + x);
        }
    }
}
