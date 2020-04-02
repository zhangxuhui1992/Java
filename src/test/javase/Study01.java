package test.javase;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-22 17:02
 *
 *  Java语言的特点：免费、开源、安全、跨平台、面向对象
 *  path:告诉计算机操作系统JAVA的程序javac、java等在哪里。
 *  classpath：在1.5后之后不用配置，但是如果配置了一定配置准确，不然程序无法运行。指示哪里加载class文件。
 *
 *  goto和const作为保留字存在，目前并不使用。
 */
/*public class Study01 {

    public static final int AGE = 18;

    public static void main(String [] args){
        int age = 16 ;
        final String NAME_TOM = "程忠霞";
        System.out.println("Hello World");
        System.out.println(NAME_TOM);
        System.out.println(AGE);
        byte num = 10 ;
        //num = (byte)(num + 10) ;
        num += 10;
        System.out.println(num);

    }
}*/

/*
 * equals方法
 */
public class Study01 {
    public static void main(String[] args) {

        Person p1 = new Person("小明",17);
        Person p2 = new Person("小明",17);

        System.out.println(p1.equals(p2));// 判断的是对象的内容
        System.out.println(p1 == p2);// 判断的是对象的地址
    }

}

class Person {
    private int age;
    private String name;

    Person(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 如果两个引用指向的同一个对象，不用进行转换。直接比较地址。
            return true;
        }
        if (!(obj instanceof Person)) { // 判断是否是同一类型
            return false;
        } else {
            Person p = (Person) obj;// 要想使用子类对象的特有属性和行为，必须对其进行向下转型。
            return this.name.equals(p.name) && this.age == p.age;
        }
    }
}
