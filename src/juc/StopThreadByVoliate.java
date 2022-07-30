package juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2022/7/30
 * @email zxh_1633@163.com
 */
public class StopThreadByVoliate {
    //线程之间可见
    private static volatile boolean isStop = false;
    public static void main(String[] args) throws Exception {
        new Thread(()->{
            while (true){
                if(isStop){
                    System.out.println("isStop="+isStop);
                    break;
                }
                System.out.println("thread running...");
            }
        },"a").start();

        TimeUnit.SECONDS.sleep(1);
        isStop = true;
    }
}
