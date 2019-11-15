package com.ybjt.study07;

import org.junit.Test;

/**
 * @author zxh
 * @create 2019-11-14 10:24
 */
public class SysremTest {

    @Test
    public void test1(){
        long l = System.currentTimeMillis();//时间
        String property = System.getProperty("java.version");//获取系统属性
        System.gc();//通知垃圾回收机制回收
        System.exit(0);//系统退出
    }
}
