package com.ybjt.test;

import com.ybjt.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxh
 * @create 2019-07-24 16:02
 * 集合
 */
public class TestCollection {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("小白","25","北京"));
        list.add(new User("小花","23","天津"));
        for (User user:list) {
            System.out.println(user.getAddress());
        }
    }

}
