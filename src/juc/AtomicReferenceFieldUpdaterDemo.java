package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * @Author zhangxuhui
 * @Date 2022/8/1
 * @email zxh_1633@163.com
 */

class Myvar{

    public volatile Boolean isInit = Boolean.FALSE;

    AtomicReferenceFieldUpdater<Myvar,Boolean> updater = AtomicReferenceFieldUpdater.newUpdater(
            Myvar.class,Boolean.class,"isInit"
    );

    public void init(Myvar myvar){
        try {
            //等待线程全部启动
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(updater.compareAndSet(myvar,Boolean.FALSE,Boolean.TRUE)){
            System.out.println(Thread.currentThread().getName()+" is initing");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName()+" init over");
            }
        }else{
            System.out.println(Thread.currentThread().getName()+" 无法参与初始化，已经被初始化中。。。");
        }
    }

}

public class AtomicReferenceFieldUpdaterDemo {
    public static void main(String[] args) {
        Myvar myvar = new Myvar();

        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                myvar.init(myvar);
            },String.valueOf(i)).start();
        }

    }
}
