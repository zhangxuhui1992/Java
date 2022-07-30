package juc;

/**
 * @Author zhangxuhui
 * @Date 2022/7/30
 * @email zxh_1633@163.com
 */
public class TestInterrupted {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isInterrupted());//默认为false
        Thread.currentThread().interrupt();//设置为true
        boolean interrupted = Thread.interrupted();//返回并清零舍为false
        System.out.println(interrupted);//true
        System.out.println(Thread.currentThread().isInterrupted());//false
    }
}
