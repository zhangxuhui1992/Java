package com.ybjt.study07;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zxh
 * @create 2019-11-14 9:11
 */
public class ComparableTest {

    @Test
    public void test1(){
        Goods [] arr = new Goods [5];
        arr[0] = new Goods("牛奶",5);
        arr[1] = new Goods("雪糕",2);
        arr[2] = new Goods("可乐",3);
        arr[3] = new Goods("鸡肉",25);
        arr[4] = new Goods("猪肉",50);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Goods implements Comparable{
    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods g = (Goods)o;
            if(this.price > g.price){
                return 1;
            }else if(this.price < g.price){
                return -1;
            }else{
                return 0;
            }
        }
        //return Integer.compare(this.price ,g.price);包装类比较大小的方法
        throw new RuntimeException("传入的类型不一致，无法比较!");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
