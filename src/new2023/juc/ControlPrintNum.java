package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 */
public class ControlPrintNum {
    public static void main(String[] args) {
        printNum printNum = new printNum(1);
        new Thread(()->{
            printNum.print("a",1,2);
        }).start();
        new Thread(()->{
            printNum.print("b",2,3);
        }).start();
        new Thread(()->{
            printNum.print("c",3,1);
        }).start();
    }
}

/**
 * a 1 2
 * b 2 3
 * c 3 1
 */
class printNum{
    private int loopNum = 5;
    private int flag;

    public printNum(int flag) {
        this.flag = flag;
    }

    public void print(String msg, int waitflag, int nextFlag){
        for (int i = 0; i < loopNum; i++) {
            synchronized (this){
                while (flag != waitflag){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(msg);
                flag = nextFlag;
                this.notifyAll();
            }
        }
    }
}

