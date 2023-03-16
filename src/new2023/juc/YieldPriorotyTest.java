package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/16
 * @email zxh_1633@163.com
 */
public class YieldPriorotyTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            int count = 0;
            for (; ; ) {
                System.out.println("t1--"+count++);
            }
        });

        Thread t2 = new Thread(() -> {
            int count = 0;
            for (; ; ) {
                //Thread.yield();//礼让
                System.out.println("        t2--"+count++);
            }
        });

        t2.start();
        t1.start();

        //设置线程优先级
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

    }
}
