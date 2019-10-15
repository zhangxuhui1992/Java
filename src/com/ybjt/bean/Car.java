package com.ybjt.bean;

/**
 * 如果类的构造器或者静态方法工厂中有多个参数（四个参数以上），使用Builder
 * 构建者设计模式
 * 避免创建不必要的对象
 * @author zxh
 * @create 2019-10-08 13:43
 */
public class Car {
    private String name;
    private String old;
    private String num;

    public static class Bulider{
        private String name = "奥迪";
        private String old;
        private String num;

        public Bulider setOld(String old){
            this.old = old;
            return this;
        }

        public Bulider setNum(String num){
            this.num = num;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    private Car(Bulider bulider){
        this.name = bulider.name;
        this.old = bulider.old;
        this.num = bulider.num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", old='" + old + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}

