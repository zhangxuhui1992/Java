package com.ybjt.study02;

/**
 * while循环
 * 迭代条件丢失，会产生死循环。
 * 编码中应避免死循环
 * for循环和while循环可以相互转换。但是两者的初始化条件变量的作用域不一样
 * @author zxh
 * @create 2019-09-02 12:14
 */
public class whileTest {
    public static void main(String[] args) {
        int num = 0;
        while (num<100){
            System.out.println(num);
            num++;
        }
    }
}
