package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-07-24 20:44
 * 输出100的质数：（只能被1和它本身整除的自然数）从1开到100-1结束
 * 最小的质数是2
 */
public class TestZhiShu {
    public static void main(String[] args) {
        for(int i = 2;i<=100;i++){
            boolean flag = true;//默认为质数
            for(int j = 2;j<i;j++){
                if(i % j == 0){//能除尽，就不是质数
                    flag = false;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
