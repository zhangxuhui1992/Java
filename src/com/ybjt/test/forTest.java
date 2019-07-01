package com.ybjt.test;

/**
 * for循环
 * 利用循环打印九九乘法表
 *
 * @author zxh
 * @create 2019-07-01 10:57
 */
public class forTest {
    public static void main(String[] args) {
        /**
         * break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
         *  break 跳出最里层的循环，并且继续执行该循环下面的语句。(跳出当前循环)
         * continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
         *  在 for 循环中，continue 语句使程序立即跳转到更新语句。
         *  在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。（跳出当次循环，继续下面的循环）
         */
        for(int i = 1 ;i<10;i++){
            for(int k =1;k<=i;k++){
                System.out.print(k+"*"+i+"="+i*k+"\t");
            }
            System.out.println();
        }
    }
}
