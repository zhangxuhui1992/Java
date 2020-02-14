package com.re;

/**
 * @author zxh
 * @create 2020-02-12 10:03
 * abstract 抽象关键字来修饰类和方法 构成抽象类和抽象方法。
 * 有抽象方法的类，叫做抽象类。抽象类不能实例化，只能由其子类实例化。
 */
public abstract class Animal {
    abstract void eat();
    abstract void move();

    public void paly(){
        System.out.println("paly games");
    }
}


class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("eat fish");
    }

    @Override
    void move() {
        System.out.println("ben ben tiao tiao ");
    }
}

class Test{
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.eat();
        cat.move();
        cat.paly();
    }
}
