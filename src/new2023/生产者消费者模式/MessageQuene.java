package new2023.生产者消费者模式;

import java.util.LinkedList;

/**
 * @Author zhangxuhui
 * @Date 2023/4/5
 * @email zxh_1633@163.com
 * 消息队列
 */
public class MessageQuene {

    private LinkedList<Message> list = new LinkedList<>();
    private int cap;

    public MessageQuene(int cap) {
        this.cap = cap;
    }

    public Message take(){
        synchronized (list){
            while (list.isEmpty()){
                try {
                    System.out.println(Thread.currentThread().getName()+"队列为空，没有消息。");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message last = list.removeLast();
            System.out.println(Thread.currentThread().getName()+"消费消息："+last);
            list.notifyAll();
            return last;
        }
    }


    public void put(Message msg){
        synchronized (list){
            while (list.size() == cap){
                try {
                    System.out.println(Thread.currentThread().getName()+"队列已满");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.addFirst(msg);
            System.out.println(Thread.currentThread().getName()+"生产消息："+msg);
            list.notifyAll();
        }
    }
}
