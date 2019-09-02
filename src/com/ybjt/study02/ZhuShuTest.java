package com.ybjt.study02;

/**
 * 输出100以内的质数
 * 质数：只能被1和它本身整除的自然数-->从2开始到这个数减一结束都不能被整除
 * 最小的质数是2
 * @author zxh
 * @create 2019-09-02 21:24
 */
public class ZhuShuTest {
    public static void main(String[] args) {
        boolean flag = true;
        for(int i = 2;i<=100;i++){
            //用i除以每个2到i-1之间的数
            for(int k = 2;k<i;k++){
                //如果有一个数被除尽了，那么i就不是质数
                if(i%k == 0){
                  flag = false;
                }
            }
            //不是质数flag为false.不输出
            if(flag){
                System.out.println(i);
            }
            //每判断完一个数之后，将falg重置为true,以便进行下一个数的判断。
            flag = true;
        }
    }
}
