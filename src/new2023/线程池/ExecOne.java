package new2023.线程池;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author zhangxuhui
 * @Date 2023/4/14
 * @email zxh_1633@163.com
 */
public class ExecOne {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //空闲线程数 = 总线程数 - 核心线程数
        //newFixedThreadPool空闲线程数 = 0
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //无返回值
        pool.execute(()->{
            System.out.println(666);
        });
        //有返回值
        Future<String> task = pool.submit(()->{
           return "python";
        });
        System.out.println(task.get());
        pool.shutdown();
    }
}
