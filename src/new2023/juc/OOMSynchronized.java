package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/19
 * @email zxh_1633@163.com
 */
public class OOMSynchronized {
    public static void main(String[] args) throws  Exception{
        Room room = new Room();

        Thread t1 = new Thread(() -> {
            for (int i = 0 ; i < 5000 ;i++){
                room.incr();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0 ; i < 5000 ;i++){
                room.decr();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(room.getCount());
    }
}

class Room{
    private int count = 0;

    public void incr(){
        synchronized(this){
            count++;
        }
    }

    public void decr(){
        synchronized (this){
            count--;
        }
    }

    public int getCount(){
        synchronized (this){
            return count;
        }
    }
}

class test{
    public void t1(){
        synchronized (this){

        }
    }

    public synchronized  void t2(){

    }
}

class test2{
    public synchronized static void t(){

    }

    public void t2(){
        synchronized (test2.class){

        }
    }
}
