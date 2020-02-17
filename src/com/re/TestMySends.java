package com.re;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-15 16:50
 */
public class TestMySends {
    public static void main(String[] args) {

        Thread you = new Thread(new You());
        Thread god = new Thread(new God());

        //设置为守护线程
        //JVM的停止不会等待守护线程是否执行完毕
        god.setDaemon(true);

        you.start();
        god.start();



        new Thread(()->{
            System.out.println("Lanbda表达式");
            System.exit(0);
        }).start();

    }
}



class You implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 365*100 ; i++){
            System.out.println("快乐的第"+i+"天");
        }
    }
}


class God implements Runnable{
    @Override
    public void run() {
        for(;;){
            System.out.println("God with you forever");
        }
    }
}
