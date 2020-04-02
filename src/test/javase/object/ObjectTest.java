package test.javase.object;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-02 14:34
 */
public class ObjectTest {
    public static void main(String [] args) throws CloneNotSupportedException{
        //Object o = new Object();
        //System.out.println(o);
        //System.out.println(o.hashCode());
        Car car = new Car("长城H6", "15万");
        Person p = new Person("bob", "18",car);

        System.out.println(p);

        Person p1 = p.clone();

        System.out.println(p1);

        /**
         *  克隆对象与原始对象的引用对象是同一对象为浅拷贝
         *  此时，person的克隆方法，没有克隆其内引用的对象。
         *  true
         */
        System.out.println(p1.getCar() == p.getCar());

        /**
         * 当被引用的对象也克隆后，那么克隆对象与原始对象中的引用对象
         * 为不用的对象。
         * Person p= (Person)super.clone();
         * p.setCar((Car) p.getCar().clone());
         */


    }
}


/**
 * hashCode的常规协定是：
 * 1.在java应用程序执行期间,在对同一对象多次调用hashCode()方法时,必须一致地返回相同的整数,前提是将对象进行equals比较时所用的信息没有被修改。
 * 从某一应用程序的一次执行到同一应用程序的另一次执行,该整数无需保持一致。
 * 2.如果根据equals(object)方法,两个对象是相等的,那么对这两个对象中的每个对象调用hashCode方法都必须生成相同的整数结果。
 * 3.如果根据equals(java.lang.Object)方法,两个对象不相等,那么对这两个对象中的任一对象上调用hashCode()方法不要求一定生成不同的整数结果。
 * 但是,程序员应该意识到,为不相等的对象生成不同整数结果可以提高哈希表的性能。
 */
