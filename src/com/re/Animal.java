package com.re;

/**
 * @author zxh
 * @create 2020-02-12 10:03
 * abstract ����ؼ�����������ͷ��� ���ɳ�����ͳ��󷽷���
 * �г��󷽷����࣬���������ࡣ�����಻��ʵ������ֻ����������ʵ������
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
