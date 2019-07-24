package com.ybjt.test;

import java.util.UUID;

/**
 * @author zxh
 * @create 2019-07-24 17:06
 */
public class TestUUID {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        //去掉uuid的分隔符
        //uuid = uuid.replace("-","");
        String[] str = uuid.split("-");
        for (String s:str) {
            System.out.println(s);
        }
    }
}
