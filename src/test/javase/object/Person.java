package test.javase.object;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-02 15:32
 */
public class Person implements Cloneable{

    private String name;
    private String age;
    private Car car;

    public Person() {
    }

    public Person(String name, String age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", car=" + car +
                '}';
    }

    /**
     * 重写克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Person clone() throws CloneNotSupportedException {

        Person p= (Person)super.clone();

        p.setCar((Car) p.getCar().clone());

        return p;
    }
}
