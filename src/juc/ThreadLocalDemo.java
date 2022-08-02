package juc;

/**
 * @Author zhangxuhui
 * @Date 2022/8/2
 * @email zxh_1633@163.com
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<Integer> tl = ThreadLocal.withInitial(()->0);
        tl.set(2);
        System.out.println(tl.get());
    }
}
