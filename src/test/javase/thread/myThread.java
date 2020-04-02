package test.javase.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-02 21:26
 */
class myThreadTest implements Runnable {

    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
            lock.lock();
        try{
            for (int i = 0 ; i< 100;i++){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }
}

public class myThread{
    public static void main(String[] args) {

        myThreadTest my = new myThreadTest();
        Thread t = new Thread(my);
        Thread t2 = new Thread(my);
        t.start();
        t2.start();
    }
}
