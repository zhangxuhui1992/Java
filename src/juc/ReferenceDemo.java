package juc;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2022/8/2
 * @email zxh_1633@163.com
 */
class MyObject{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("run gc");
    }
}

public class ReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        //转换为弱引用对象，执行gc则被回收。
        WeakReference<MyObject> reference = new WeakReference<>(new MyObject());
        System.out.println(reference.get());
        System.gc();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(reference.get());
    }
}
