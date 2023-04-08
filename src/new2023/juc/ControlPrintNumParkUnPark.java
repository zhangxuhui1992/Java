package new2023.juc;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 */
public class ControlPrintNumParkUnPark {
    static Thread t1;
    static Thread t2;
    static Thread t3;
    public static void main(String[] args) {
        ParkPrint pp = new ParkPrint();
         t1 = new Thread(() -> {
            pp.print("a",t2);
        }, "t1");
         t2 = new Thread(() -> {
             pp.print("b",t3);
        }, "t2");
         t3 = new Thread(() -> {
             pp.print("c",t1);
        }, "t3");

         t1.start();
         t2.start();
         t3.start();
        LockSupport.unpark(t1);
    }
}

class ParkPrint{
    private int loopnum = 5;

    public void print(String msg,Thread next){
        for (int i = 0; i < loopnum; i++) {
            LockSupport.park();
            System.out.print(msg);
            LockSupport.unpark(next);
        }
    }

}
