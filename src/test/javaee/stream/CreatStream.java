package test.javaee.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-03 10:09
 */
public class CreatStream {
    public static void main(String[] args) throws Exception {
        //方式一
        ArrayList<String> list = new ArrayList();
        Stream<String> stream = list.stream();//顺序流
        Stream<String> stringStream = list.parallelStream();//并行流


        //方式二
        int [] nums = new int [10];
        IntStream streamArr = Arrays.stream(nums);


        //方式三
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //integerStream.forEach(System.out::println);

        Stream<Integer> limitStream = Stream.iterate(0, (x) -> x + 2).limit(8);
        //limitStream.forEach(System.out::println);


        Stream<Double> limitMathStream = Stream.generate(Math::random).limit(50);
        //limitMathStream.forEach(System.out::println);

        //方式四
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\stream.txt"));
        Stream<String> lines = bufferedReader.lines();
        lines.forEach(System.out::println);

    }
}
