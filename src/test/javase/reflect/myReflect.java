package test.javase.reflect;

import test.javase.object.Car;
import test.javase.object.Person;

import java.lang.reflect.Constructor;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-02 21:46
 */
public class myReflect {
    public static void main(String[] args) throws Exception {
       Class clazz = Class.forName("test.javase.object.Person");

       Person p = (Person) clazz.newInstance();
       p.setName("张旭辉");
       p.setAge("18");
       p.setCar(new Car("aodi", "25"));

       System.out.println(p);


        Class<Person> c = Person.class;
        Constructor<Person> constructor = c.getConstructor(String.class, String.class, Car.class);
        Person person = constructor.newInstance("bob", "20", new Car("baoma", "30"));
        System.out.println(person);
    }
}
