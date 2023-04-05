package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/4/5
 * @email zxh_1633@163.com
 * wait等方法必须在同步代码块中，且锁对象必须一致。
 */
public class WaitTest {
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (new Object()) {
                try {
                    WaitTest.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
