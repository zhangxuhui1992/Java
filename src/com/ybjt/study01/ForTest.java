package com.ybjt.study01;

/**
 * 循环结构的4要素
 * 初始化条件
 * 循环条件是boolean类型
 * 循环体
 * 迭代条件
 * @author zxh
 * @create 2019-08-31 8:37
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            System.out.println("循环了"+(i+1)+"次！！");
        }

        //遍历100以内的偶数
        for(int i = 0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
