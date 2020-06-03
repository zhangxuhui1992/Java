package test.javaee.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-03 10:33
 */
public class StreamTest {
    public static void main(String[] args) {
        /**
         * 筛选与切片
         * filter()过滤流中的某些元素
         * limit(n)获取前n个元素
         * skip(n)跳过前n个元素
         * distinct通过流中元素的hashCode和equals去除重复元素
         */
        Stream<Integer> integerStream = Stream.of(6, 50, 4, 30, 20, 12, 15, 70,50,60,30);

        Stream<Integer> newStreanm = integerStream.filter(s -> s > 20).limit(5).skip(2).distinct();

        //newStreanm.forEach(System.out::println);


        /**
         * 映射
         * map接收一个函数作为参数，该函数会被引用到每个元素上，并将其映射成一个新的元素。
         * flatmap接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。
         */

        List<String> stringList = Arrays.asList("a,b,c", "1,2,3");

        Stream<String> stringStream = stringList.stream().map(s -> s.replaceAll(",", ""));
        //stringStream.forEach(System.out::println);

        Stream<Object> objectStream = stringList.stream().flatMap(s ->{
            String[] split = s.split(",");
            Stream<String> stream = Arrays.stream(split);
            return stream;
        });
        //objectStream.forEach(System.out::print);

        /**
         * 排序
         * sorted() 自然排序，流中元素实现Comparable接口
         * sorted(Comparator com)  定制排序，自定义Compatator排序器
         */

        List<String> strings = Arrays.asList("a", "f", "h", "b", "c");
        Stream<String> sorted = strings.stream().sorted();
        //sorted.forEach(System.out::println);

        Students s1 = new Students("张三", 18);
        Students s2 = new Students("李四", 20);
        Students s3 = new Students("王五", 15);
        Students s4 = new Students("赵六", 25);
        List<Students> students = Arrays.asList(s1, s2, s3, s4);
        students.stream().sorted((o1,o2)->{
                if(o1.getName().equals(o2.getName())){
                    return o1.getAge()-o2.getAge();
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        ).forEach(System.out::println);



        /**
         * 消费
         *  peek：如同于map，能得到流中的每一个元素。但map接收的是一个Function表达式，有返回值；
         *  而peek接收的是Consumer表达式，没有返回值。
         */
        Students s5 = new Students("张三", 18);
        Students s6 = new Students("李四", 20);
        List<Students> studenta = Arrays.asList(s5, s6);
        studenta.stream().peek(o->o.setAge(25)).forEach(System.out::println);


        /**
         * 匹配、聚合操作
         * allMatch：接收一个 Predicate 函数，当流中每个元素都符合该断言时才返回true，否则返回false
         * noneMatch：接收一个 Predicate 函数，当流中每个元素都不符合该断言时才返回true，否则返回false
         * anyMatch：接收一个 Predicate 函数，只要流中有一个元素满足该断言则返回true，否则返回false
         * findFirst：返回流中第一个元素
         * findAny：返回流中的任意元素
         * count：返回流中元素的总个数
         * max：返回流中元素最大值
         * min：返回流中元素最小值
         */

        List<Integer> integers = Arrays.asList(1, 3, 56, 78, 90, 42);
        boolean b = integers.stream().allMatch(i -> i > 10);
        System.out.println(b);


        /**
         * 收集操作
         * collect：接收一个Collector实例，将流中元素收集成另外一个数据结构。
         */
        Students s7 = new Students("张三", 18);
        Students s8 = new Students("李四", 20);
        List<Students> studentas = Arrays.asList(s7, s8);
        List<String> collect = studentas.stream().map(Students::getName).collect(Collectors.toList());
        System.out.println(collect);
    }
}
