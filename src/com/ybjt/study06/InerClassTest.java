package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-06 17:21
 */
public class InerClassTest {
    public static void main(String[] args) {
        Circle.Draw d= new Circle.Draw();
        d.drawSahpe();
    }
}

class Circle {
    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    static class Draw {     //内部类
        public void drawSahpe() {
            System.out.println("drawshape");
        }
    }
}
