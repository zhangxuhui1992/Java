package com.ybjt.test;

/**
 * 模板方法的设计模式、抽象类的使用
 * @author zxh
 * @create 2019-08-15 10:13
 */
public class AbstractTest {
    public static void main(String[] args) {
        Woman w = new Woman();
        w.run();
        System.out.println("***********************************");
        Weminr we = new Weminr();
        we.run();


    }

}


abstract class Bclank{

    public void paidui(){
        System.out.println("先排队");
    }

    public abstract void access();

    public void pingJia(){
        System.out.println("对服务评价！");
    }

    /**
     * 执行流程，每个子类对象调用的方法。
     */
    public void run(){
        paidui();
        access();
        pingJia();
    }
}

class Woman extends Bclank{
    public void access(){
        System.out.println("男人靠左边");
    }
}

class Weminr extends Bclank{
    public void access(){
        System.out.println("女人靠右边");
    }
}