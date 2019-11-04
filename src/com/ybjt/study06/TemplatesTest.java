package com.ybjt.study06;

/**
 * 抽象的应用模板方法
 * @author zxh
 * @create 2019-11-01 16:06
 */
public class TemplatesTest {
    public static void main(String[] args) {
        SubTemplate sub = new SubTemplate();
        sub.countTime();
    }
}


abstract class Template{
    public void countTime(){
        long start = System.currentTimeMillis();
        code();//不确定的部分、易变得部分
        long end = System.currentTimeMillis();
        System.out.println(end-start+"mm");
    }

    public abstract void code();
}


class SubTemplate extends Template{
    @Override
    public void code(){
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}