package juc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2022/7/28
 * @email zxh_1633@163.com
 */
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(()->{
            TimeUnit.SECONDS.sleep(4);
            return "Hello FutureTask";
        });

        Thread t = new Thread(task);

        t.start();

        //System.out.println(task.get());

        while(true){
            if(task.isDone()){
                System.out.println(task.get());
                break;
            }else{
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("处理中。。。");
            }
        }

    }
}
