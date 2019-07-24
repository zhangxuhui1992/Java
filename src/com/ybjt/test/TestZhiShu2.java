package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-07-24 21:04
 * 100以内的质数
 */
public class TestZhiShu2 {
    public static void main(String[] args) {
        for(int i = 2;i<=100;i++){
            boolean flag = true;//默认为质数
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i % j == 0){//能除尽，就不是质数
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
