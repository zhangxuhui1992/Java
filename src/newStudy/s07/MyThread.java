package newStudy.s07;

/**
 * @Author zhangxuhui
 * @Date 2022/1/17
 * @email zxh_1633@163.com
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"\ti="+i);
        }
    }
}

class TestMyThread{
    public static void main(String[] args) {
        MyThread th = new MyThread();
        MyThread th2 = new MyThread();
        th2.start();
        th.start();
    }
}
