package new2023.生产者消费者模式;

/**
 * @Author zhangxuhui
 * @Date 2023/4/5
 * @email zxh_1633@163.com
 */
public class TestMessage {
    public static void main(String[] args) {
        MessageQuene quene = new MessageQuene(2);

        for (int i = 0; i < 3; i++) {
            int id = i;
            new Thread(()->{
                quene.put(new Message(id,"msg"+id));
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            for (;;){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                quene.take();
            }
        }).start();
    }
}
