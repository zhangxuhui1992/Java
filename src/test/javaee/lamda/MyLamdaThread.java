package test.javaee.lamda;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-02 17:24
 */
public class MyLamdaThread {
    public static void main(String[] args) {

//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                for(int i = 0 ; i < 1000 ; i++){
//                    System.out.println(Thread.currentThread().getName()+"----->"+i);
//                }
//            }
//        }).start();

        /**
         * lamda表达式就是为了避免匿名内部类定义过多的无用操作
         */
        new Thread(()->{
            for(int i = 0 ; i < 1000 ; i++){
                System.out.println(Thread.currentThread().getName()+"----->"+i);
            }
        }).start();

        for(int i = 0 ; i < 1000 ; i++){
            System.out.println(Thread.currentThread().getName()+"----->"+i);
        }

    }
}
