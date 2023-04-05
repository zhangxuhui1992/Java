package new2023.生产者消费者模式;

/**
 * @Author zhangxuhui
 * @Date 2023/4/5
 * @email zxh_1633@163.com
 */
public final class Message {

    private int id;
    private String msg;

    public Message(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
