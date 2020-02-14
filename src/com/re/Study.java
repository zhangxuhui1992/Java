package com.re;


import java.util.Arrays;

/**
 * @author zxh
 * @create 2020-02-10 8:00
 */
public class Study {
    public static void main(String [] args){

        int a = 1;
        /**
         * 当声明的long类型的变量在int范围内编译时不报错的，因为自动类型提升。
         * 当范围超过int类型的范围，就会报错，默认int类型的变量不能提升为long类型的。在后面显示L标注为long类型的变量。
         */
        long s = 187687677777L;


        //int [] array = new int [10];
        int [] ss = {10,20,30};
        //System.out.println(array.length);
        //System.out.println(ss.length);
        for(int i = 0 ; i< ss.length ; i++){
            System.out.print(ss[i]+"\t");
        }

        String str = "Hello";
    }
}