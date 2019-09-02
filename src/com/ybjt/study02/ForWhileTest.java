package com.ybjt.study02;

import java.util.Scanner;

/**
 * 键盘输出不确定的整数，记录输入的正数和负数的个数，并显示
 * 当输入为0时程序终止
 * @author zxh
 * @create 2019-09-02 20:53
 */
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //局部变量的声明一定要赋值。
        int count = 0;
        int total = 0;
        while (true){
            int number = scanner.nextInt();
            if(number>0){
                count++;
            }else if(number<0){
                total++;
            }else{
                break;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}
