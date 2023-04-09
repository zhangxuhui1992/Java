package new2023.juc;

import java.util.concurrent.atomic.AtomicMarkableReference;

/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 */
public class AtomicReferenceMarkeTest {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(100);
        AtomicMarkableReference<Integer> amr = new AtomicMarkableReference<>(integer,true);

        boolean b = amr.compareAndSet(integer, Integer.valueOf(90), false, false);

        System.out.println(b);

        System.out.println(amr.getReference());
    }
}
