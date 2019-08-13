package com.ybjt.test;

import com.ybjt.bean.User;

/**
 * @author zxh
 * @create 2019-08-13 10:36
 */
public class TestBianliang {
    public static void main(String[] args) {
        User user = new User();
        user.song();
        System.out.println(user.getName());
    }

    public void song(){
        System.out.println();
    }
}
