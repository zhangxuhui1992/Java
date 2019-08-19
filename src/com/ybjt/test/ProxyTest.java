package com.ybjt.test;

/**
 * 静态代理设计模式、保护被代理对象
 * @author zxh
 * @create 2019-08-15 13:42
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealStar real = new RealStar();
        ProxyMen proxy = new ProxyMen(real);
        proxy.edit();
        proxy.song();
    }
}

interface Function{
   void edit();
   void song();
}

class RealStar implements Function{
    @Override
    public void edit() {}

    @Override
    public void song() {
        System.out.println("明星唱.......");
    }
}

class ProxyMen implements Function{
    private RealStar real;

    public ProxyMen(RealStar real) {
        this.real = real;
    }

    @Override
    public void edit() {
        System.out.println("经理人去办......");
    }

    @Override
    public void song() {
        real.song();
    }
}