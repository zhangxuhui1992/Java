package test.javase.object;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-02 15:35
 */
public class Car implements Cloneable {

    private String name;
    private String price;

    public Car() {
    }

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
