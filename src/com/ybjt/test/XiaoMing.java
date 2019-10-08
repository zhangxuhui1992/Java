package com.ybjt.test;

import com.ybjt.bean.Car;
import com.ybjt.bean.User;

/**
 * @author zxh
 * @create 2019-07-24 15:56
 */
public class XiaoMing extends User {
    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing();
        xiaoMing.setName("小明");
        xiaoMing.song();

        Car aodi = new Car.Bulider().setNum("2").setOld("20").build();
        System.out.println(aodi);
    }
}
