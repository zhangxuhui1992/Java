package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/21
 * @email zxh_1633@163.com
 */
public class AcountTest {
    public static void main(String[] args) throws InterruptedException {
        Counter a = new Counter(1000);
        Counter b = new Counter(1000);

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                a.transfer(b,1);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                b.transfer(a,1);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(a.getCount()+ b.getCount());
    }
}

class Counter{
    private int count;

    Counter(int count){
        this.count=count;
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public void transfer(Counter target,int money){
        //类锁，因为this和target为不同的对象，不能用对象锁。
        //他们共同的对象是Counter.class类对象。
        //操作系统会给我对象分配Monitor对象，从而保证线程安全
        synchronized (Counter.class) {
            if (this.count >= money) {
                this.setCount(this.count - money);
                target.setCount(target.count + money);
            }
        }
    }
}
