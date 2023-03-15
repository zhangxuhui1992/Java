package new2023.option;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * @Author zhangxuhui
 * @Date 2023/3/14
 * @email zxh_1633@163.com
 */
public class OptionalTest {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6});

        IntStream intStream = Optional.of(stream).orElseGet(() -> {
            return IntStream.of(100);
        });

        long count = intStream.count();
        System.out.println(count);


    }
}
