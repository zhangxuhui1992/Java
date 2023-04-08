package new2023.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 */
public class ControlPrintNumReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        awaitSinglePrint asp = new awaitSinglePrint();
        Condition a = asp.newCondition();
        Condition b = asp.newCondition();
        Condition c = asp.newCondition();
        new Thread(()->{
            asp.print("a",a,b);
        }).start();
        new Thread(()->{
            asp.print("b",b,c);
        }).start();
        new Thread(()->{
            asp.print("c",c,a);
        }).start();

        Thread.sleep(1000);
        asp.lock();
        try {
            a.signal();
        }finally {
            asp.unlock();
        }
    }
}

class awaitSinglePrint extends ReentrantLock{
    private int loopNum = 5;

    public void print(String msg,Condition current,Condition next){
        lock();
        try {
            for (int i = 0; i < loopNum; i++) {
                try {
                    current.await();
                    System.out.print(msg);
                    next.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            unlock();
        }
    }
}
