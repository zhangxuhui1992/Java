package juc;

/**
 * 两阶段终止模式
 * @Author zhangxuhui
 * @Date 2023/2/20
 * @email zxh_1633@163.com
 */
public class TwoPhaseTermation {
    public static void main(String[] args) throws InterruptedException {
        TwoPhase tp = new TwoPhase();

        tp.start();

        Thread.sleep(3000);

        tp.stop();
    }
}

class TwoPhase{
    private Thread mointor;
    //启动线程
    public void start(){
        mointor = new Thread(()->{
            while (true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("料理后事：。。。");
                    break;
                }

                try {
                    Thread.sleep(1000);
                    System.out.println("系统监控：。。。");
                } catch (InterruptedException e) {
                    //sleep阻塞的线程被打断将清空打断标记并抛出异常
                    e.printStackTrace();
                    //重置线程打断标记
                    mointor.interrupt();
                    //Thread.interrupted();判断线程是否被打断，会清空打断状态。
                }


            }
        });
        mointor.start();
    }
    //停止线程
    public void stop(){
        mointor.interrupt();
    }

}
