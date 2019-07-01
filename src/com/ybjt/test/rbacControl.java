package com.ybjt.test;

/**
 * 访问控制修饰符
 * @author zxh
 * @create 2019-07-01 9:48
 */
public class rbacControl {
    /**
     *  public 公开的 权限最大，对所有类可见
     *  protected 受保护的，同一包内的类和其子类中可见
     *  deafult 默认的，可以省略不写，在同一包内可见
     *  private 私有的，在同一类中可见。
     */
    public static final int AGE = 25;
    public static void main(String [] args) {
        System.out.println("年龄："+AGE);
    }
}
