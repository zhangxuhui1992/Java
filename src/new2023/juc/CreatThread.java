package new2023.juc;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author zhangxuhui
 * @Date 2023/3/15
 * @email zxh_1633@163.com
 */
public class CreatThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Log log = LogFactory.get();
        Thread t = new Thread("t1") {
            @Override
            public void run() {
                log.info("666");
            }
        };
        t.start();

        log.info("main is over");

        Runnable run = new Runnable() {
            @Override
            public void run() {

            }
        };

        new Thread(()->{
            System.out.println("666");
        },"t2").start();

        FutureTask<Integer> task = new FutureTask<Integer>(()->{
            return 100;
        });
        new Thread(task,"t3").start();

        System.out.println(task.get());

    }
}
