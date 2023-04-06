package new2023.哲学家就餐问题;

/**
 * @Author zhangxuhui
 * @Date 2023/4/6
 * @email zxh_1633@163.com
 */
public class TestKZ {
    public static void main(String[] args) {
        kuaiZi k1 = new kuaiZi(1);
        kuaiZi k2 = new kuaiZi(2);
        kuaiZi k3 = new kuaiZi(3);
        kuaiZi k4 = new kuaiZi(4);
        kuaiZi k5 = new kuaiZi(5);

        new Thread(new KeXueJia(k1,k2,"k1")).start();
        new Thread(new KeXueJia(k2,k3,"k2")).start();
        new Thread(new KeXueJia(k3,k4,"k3")).start();
        new Thread(new KeXueJia(k4,k5,"k4")).start();
        new Thread(new KeXueJia(k5,k1,"k5")).start();

    }
}
