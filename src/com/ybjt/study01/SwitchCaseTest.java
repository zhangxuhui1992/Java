package com.ybjt.study01;

import java.util.Scanner;

/**
 * switch...case..
 * switch(表达式){
 *     case 常量：
 *          语句；
 *          break;
 *     case 常量：
 *         语句；
 *         break;
 *     default:
 *         语句；
 * }
 * 表达式中的值依次匹配case后面的常量，如果匹配成功，则执行里面的语句，break退出整个switch结构。
 * 如果没有break，就会穿透执行每个case里面的语句，直到执行完或者遇到break。
 * 表示式只能是如下类型：byte short int char 枚举类型(JDk5.0新增) String（JDK7.0新增）
 * case只能声明常量，不能声明范围、
 * break关键字是可选的
 * default结构是可选的，而且位置是灵活的。
 * 凡是可以使用switch-case的结构，都可以转成if-else,反之不成立。两个能够同时使用，且情况较少，那么使用
 * switch-case,结构清晰，效率较高。
 * @author zxh
 * @create 2019-08-30 15:15
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int i = scanner.nextInt();
        switch(i){
            case 20:
                System.out.println("20岁不小了！");
                break;
            case 30:
                System.out.println("要生孩子了！");
                break;
        }
    }
}
