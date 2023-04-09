package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 */
public class AtomicIntergerTest {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(100);
        for (int x = 0;x < 10;x++){
            new Thread(()->{
                while (true){
                    int i = ai.get();
                    int update = i - 10;
                    if(ai.compareAndSet(i,update)){
                        System.out.println(Thread.currentThread().getName()+"将："+i+"更新为："+update);
                        break;
                    }
                }
            }).start();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("最后结果为："+ai.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //函数式接口，自定义计算表达式
        ai.updateAndGet(x -> 10*x);
    }
}
