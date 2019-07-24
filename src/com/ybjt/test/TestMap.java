package com.ybjt.test;

import com.ybjt.bean.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zxh
 * @create 2019-07-24 16:40
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, User> map = new HashMap<>();
        map.put("1",new User("小小","63","中关村"));
        System.out.println(map.size());
    }
}
