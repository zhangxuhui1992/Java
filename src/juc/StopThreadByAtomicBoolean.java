package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author zhangxuhui
 * @Date 2022/7/30
 * @email zxh_1633@163.com
 */
public class StopThreadByAtomicBoolean {
    static AtomicBoolean flag = new AtomicBoolean(false);
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (true){
                if(flag.get()){
                    System.out.println("flag="+flag);
                    break;
                }
                System.out.println("thread running...");
            }
        },"a").start();

        TimeUnit.MILLISECONDS.sleep(1);
        flag.set(true);
    }
}
