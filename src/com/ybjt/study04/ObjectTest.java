package com.ybjt.study04;

import com.ybjt.bean.User;

/**
 * @author zxh
 * @create 2019-09-16 20:50
 */
public class ObjectTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("bob");
        System.out.println(user.getName());
        user.song();
    }
}
