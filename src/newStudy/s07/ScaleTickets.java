package newStudy.s07;

/**
 * @Author zhangxuhui
 * @Date 2022/1/17
 * @email zxh_1633@163.com
 */
public class ScaleTickets implements Runnable{
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (lock){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"\tticket="+ticket--);
                }else{
                    return;
                }
            }
        }
    }
}


class TestScalse{
    public static void main(String[] args) {
        ScaleTickets st = new ScaleTickets();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        Thread t3 = new Thread(st);
        Thread t4 = new Thread(st);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
