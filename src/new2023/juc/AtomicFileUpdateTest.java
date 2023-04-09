package new2023.juc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 * 原子字段更新器
 */
public class AtomicFileUpdateTest {
    public static void main(String[] args) {
//        AtomicReferenceFieldUpdater
//        AtomicIntegerFieldUpdater
//        AtomicLongFieldUpdater
        Student s = new Student();
        AtomicReferenceFieldUpdater arfu = AtomicReferenceFieldUpdater.newUpdater(Student.class,String.class,"name");
        arfu.compareAndSet(s,null,"zhangsan");
        System.out.println(s);
    }
}

class Student{
    volatile String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
