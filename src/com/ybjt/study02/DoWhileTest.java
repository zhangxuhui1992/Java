package com.ybjt.study02;

/**
 * do{
 *
 * }while();
 * 会至少执行一次循环体
 * 实际开发中经常使用for.while.循环结构
 * @author zxh
 * @create 2019-09-02 12:23
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println(num);
            num++;
        }while(num<100);
    }
}
