package new2023.哲学家就餐问题;

/**
 * @Author zhangxuhui
 * @Date 2023/4/6
 * @email zxh_1633@163.com
 */
public class KeXueJia implements Runnable{
    private kuaiZi left;
    private kuaiZi right;
    private String name;

    public KeXueJia(kuaiZi left, kuaiZi right, String name) {
        this.left = left;
        this.right = right;
        this.name = name;
    }

    @Override
    public void run() {
       while (true){
           synchronized (left){
               synchronized (right){
                   System.out.println(Thread.currentThread().getName()+" eat...");
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       }
    }
}
