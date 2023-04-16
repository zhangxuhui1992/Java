package new2023.线程池;

/**
 * @Author zhangxuhui
 * @Date 2023/4/16
 * @email zxh_1633@163.com
 * ThreadLocal线程局部变量
 * ThreadLocalMap为弱引用并不能完全避免内存泄漏
 * 解决方案：
 *    1.使用完ThreadLocal调用remove()方法删除对应的entry
 *    2.使用完ThreadLocal对应thread运行结束
 */
public class ThreadLocalTest {

    static class MyName{
        ThreadLocal<String> nametl = new ThreadLocal<>();

        //private String name;

        public String getName() {
            return nametl.get();
        }

        public void setName(String name) {
            nametl.set(name);
        }
    }



    public static void main(String[] args) {
        MyName name = new MyName();
        for (int i = 0; i < 100000; i++) {
            int y = i;
            new Thread(()->{
                name.setName(Thread.currentThread().getName()+":"+y);
                System.out.println("---------------------");
                System.out.println(Thread.currentThread().getName()+"获取："+name.getName());
            }).start();
        }
    }
}
