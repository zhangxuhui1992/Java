package com.ybjt.study10;

/**
 * 静态代理
 * @author zxh
 * @create 2019-11-21 12:11
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        MacFactory mac = new MacFactory();
        CenterFactory center = new CenterFactory(mac);
        center.prodeuce();
    }
}


//接口定义功能
interface ComputerFactory{
    public void prodeuce();
}

class MacFactory implements ComputerFactory{
    @Override
    public void prodeuce() {
        System.out.println("生产16寸MacBook pro");
    }
}

class CenterFactory implements ComputerFactory{

    private ComputerFactory macfactory;

    public CenterFactory(ComputerFactory macfactory) {
        this.macfactory = macfactory;
    }

    @Override
    public void prodeuce() {
        System.out.println("生产包装配件");
        macfactory.prodeuce();
        System.out.println("售后服务");

    }
}