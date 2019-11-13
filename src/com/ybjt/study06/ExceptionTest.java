package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-06 16:42
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("厉害");
        }
        System.out.println("就是这么厉害。。");
    }
}
