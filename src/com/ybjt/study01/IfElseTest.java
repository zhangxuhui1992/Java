package com.ybjt.study01;
import java.util.Scanner;
/**
 * 分支结构：if...else...单选一、二选一、多选一
 * @author zxh
 * @create 2019-08-30 14:43
 */
public class IfElseTest {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag){
            System.out.println("Java是世界上最好的语言");
        }

        if(flag){
            System.out.println("good good study");
        }else {
            System.out.println("day day up");
        }

        int num = 60;
        if(num>60){
            System.out.println("1");
        }else if(num>70){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

        //从键盘获取值
        System.out.println("请输出年龄");
        Scanner scanner = new Scanner(System.in);
        //如果输出的内容与要求的类型不匹配，产生异常InputMismatchException
        int age = scanner.nextInt();
        System.out.println("年龄："+age);
    }
}
