package juc;

import java.util.concurrent.*;

/**
 * @Author zhangxuhui
 * @Date 2022/7/28
 * @email zxh_1633@163.com
 */
public class CompletableFuturePro {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用默认的线程池，相当于守护线程，主线程结束后自动结束得不到结果。
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " come in");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = ThreadLocalRandom.current().nextInt(10);
            System.out.println("计算出结果：" + i);
            if(i<4){
                int x = i/0;
            }
            return i;
        },executorService).whenComplete((x,e)->{//完成时调用
            if(e == null){
                System.out.println("获取到结果："+x);
            }
        }).exceptionally(e->{//出现异常时调用
            e.printStackTrace();
            System.out.println(e.getCause()+"\t"+e.getMessage());
            return null;
        });

        System.out.println(Thread.currentThread().getName()+" do other something");
    }

    private static void taskone() throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> task = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " come in");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = ThreadLocalRandom.current().nextInt(10);
            System.out.println("计算出结果：" + i);
            return i;
        });

        System.out.println(Thread.currentThread().getName()+" do other something");

        System.out.println(task.get());
    }
}
