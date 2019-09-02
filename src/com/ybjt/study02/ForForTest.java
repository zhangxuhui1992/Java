package com.ybjt.study02;

/**
 * 嵌套循环
 * 外层循环控制行。内层循环控制列数。
 * 循环输出九九乘法表
 * @author zxh
 * @create 2019-09-02 21:13
 */
public class ForForTest {
    public static void main(String[] args) {
        for(int i = 1;i<=99;i++){
            for(int k = 1;k<=i;k++){
                System.out.print(i+"*"+k+"="+k*i+"\t");
            }
            System.out.println();
        }
    }
}
