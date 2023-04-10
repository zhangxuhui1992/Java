package new2023.不可变类;

import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Author zhangxuhui
 * @Date 2023/4/10
 * @email zxh_1633@163.com
 */
public class DateTimeTest {
    public static void main(String[] args) {
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    //Date date = sdf.parse("1992-01-03");
                    TemporalAccessor ta = dtf.parse("1992-01-03");
                    System.out.println(ta);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
