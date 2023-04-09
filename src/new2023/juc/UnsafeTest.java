package new2023.juc;

import sun.misc.Unsafe;
import java.lang.reflect.Field;
/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 */
public class UnsafeTest {
    public static void main(String[] args)throws Exception {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe) theUnsafe.get(null);
        Person p = new Person();
        Field id = p.getClass().getDeclaredField("id");
        Field name = p.getClass().getDeclaredField("name");
        long idoffset = unsafe.objectFieldOffset(id);
        long nameoffest = unsafe.objectFieldOffset(name);
        unsafe.compareAndSwapInt(p,idoffset,0,1);
        unsafe.compareAndSwapObject(p,nameoffest,null,"bob");
        System.out.println(p);
    }
}

class Person{
    private volatile String name;
    private volatile int id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
