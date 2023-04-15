package new2023.线程池;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhangxuhui
 * @Date 2023/4/15
 * @email zxh_1633@163.com
 */
public class CountDownLunchTest{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        CountDownLatch latch = new CountDownLatch(5);
        Random random = new Random();
        String [] pres = new String[5];
        for (int x = 0; x < 5; x++) {
            int y = x ;
            pool.execute(()->{
                for (int i = 1; i <= 100; i++) {
                    try {
                        Thread.sleep(random.nextInt(100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    pres[y] = "玩家"+(y+1)+"进度："+ i+"%";
                    System.out.print("\r"+Arrays.toString(pres));
                }
                latch.countDown();
            });
        }
        latch.await();
        System.out.println("\n"+"load end ,start game ....");
        pool.shutdown();
    }
}
