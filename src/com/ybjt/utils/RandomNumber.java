package com.ybjt.utils;

import java.util.UUID;

/**
 * @author zxh
 * @create 2019-08-08 9:01
 * 传入任意的范围，输出在此范围内的随机整数,包含头、包含尾
 */
public class RandomNumber {
    /**
     * 返回一个范围内的任意整数
     * @param start 起始范围
     * @param end 结束范围
     * @return
     */
    public static int Random(int start,int end){
        int result = (int)(Math.random()*(end-start+1)+start);
        return result;
    }

    /**
     * @return 返回一个uuid的字符串
     */
    public static String UUIDString(){
        return UUID.randomUUID().toString();
    }

}
