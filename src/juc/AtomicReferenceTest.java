package juc;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 */
public class AtomicReferenceTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(100);
        AtomicReference<BigDecimal> arf = new AtomicReference(bigDecimal);
        System.out.println(arf.get());
        if(arf.compareAndSet(bigDecimal,BigDecimal.valueOf(90))){
            System.out.println(arf.get());
        }
    }
}
