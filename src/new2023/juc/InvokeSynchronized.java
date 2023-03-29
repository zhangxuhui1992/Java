package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/29
 * @email zxh_1633@163.com
 * wait notify 必须获得锁才能调用否则IllegalMonitorStateException
 * wait 会释放锁
 * 线程内判断不能使用if
 * 使用while进行多次判断
 */
public class InvokeSynchronized {

    public static Object lock = new Object();

    public static void main(String[] args) {
        synchronized (lock){
            try {
                lock.wait();//IllegalMonitorStateException
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
