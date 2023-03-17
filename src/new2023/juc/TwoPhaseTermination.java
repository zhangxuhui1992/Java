package new2023.juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/3/17
 * @email zxh_1633@163.com
 */
public class TwoPhaseTermination {
    public static void main(String[] args) throws InterruptedException {
        Phase p = new Phase();
        p.start();

        TimeUnit.SECONDS.sleep(3);
        p.stop();
        System.out.println("等待重启...");
        TimeUnit.SECONDS.sleep(5);
        p.restart();
    }
}

class Phase{

    private Thread monitor;

    public void start(){
        monitor =  new Thread(()->{
            while (true){
                Thread current = Thread.currentThread();
                //current.isInterrupted();不会清除打断标记
                //Thread.interrupted();会清除打断标记
                if(current.isInterrupted()){
                    System.out.println("线程被打断，料理后事");
                    break;
                }

                try {
                    Thread.sleep(1000);
                    System.out.println("系统监控");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    current.interrupt();
                }

            }
        });
        monitor.start();
    }

    public void stop(){
        monitor.interrupt();
    }

    public void restart(){
        start();
    }
}
