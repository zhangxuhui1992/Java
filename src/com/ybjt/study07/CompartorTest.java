package com.ybjt.study07;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zxh
 * @create 2019-11-14 9:51
 */
public class CompartorTest {

    @Test
    public void test(){
        Car [] cars = new Car[3];
        cars[0] = new Car("手扶拖拉机",4);
        cars[1] = new Car("奔奔",3);
        cars[2] = new Car("摩托车",2);

        //Arrays.sort(cars);
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(cars));
    }
}


class Car implements Comparable{
    private String name;
    private int count;

    public Car(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Car){
            Car c = (Car)o;
            return Integer.compare(this.count,c.count);
        }
        throw new RuntimeException("类型不一致");
    }
}
