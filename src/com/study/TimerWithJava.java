package com.study;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author zxh
 * @create 2019-12-12 10:20
 * java定时器
 */
public class TimerWithJava {
    public static void main(String[] args) {
        //任务
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                System.out.println("gogo...");
            }
        };

        Timer timer = new Timer();
        //每隔2秒执行一次
        timer.schedule(task,500,1000);
    }
}
