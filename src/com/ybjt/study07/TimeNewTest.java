package com.ybjt.study07;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.logging.SimpleFormatter;

/**
 * @author zxh
 * @create 2019-11-13 21:39
 */
public class TimeNewTest {
    @Test
    public void test1(){
        //当前的日期、时间、日期+时间
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        //指定时间、不需要考虑偏移量
        LocalDateTime of = LocalDateTime.of(1992, 01, 13, 13, 12, 20);
        System.out.println(of);

        //获取
        System.out.println(now2.getDayOfMonth());//当月的第几天
        System.out.println(now2.getDayOfWeek());

        //设置，体现不可变性
        LocalDateTime localDateTime = now2.withMonth(12);
        System.out.println(localDateTime);
        System.out.println(now2);

        //增加相应数值
        LocalDateTime localDateTime1 = now2.plusDays(30);
        System.out.println(localDateTime1);

        //减去相应的数值
        LocalDateTime localDateTime2 = now2.minusDays(6);
        System.out.println(localDateTime2);
    }

    @Test
    public void test4(){
        Instant now = Instant.now();//获取本初子午线对应的标准时间
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));//根据时区，设置偏移量
        long l = now.toEpochMilli();//1970.1.1 开始的毫秒数
        long l1 = offsetDateTime.toEpochSecond();
        System.out.println(offsetDateTime);
        System.out.println(l);
        System.out.println(l1);

        Instant instant = Instant.ofEpochMilli(46564464542L);
        System.out.println(instant);

    }

    @Test
    public void test5(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = formatter.format(LocalDateTime.now());
        System.out.println(format);

        TemporalAccessor parse = formatter.parse("2019-11-13 10:28:40");
        System.out.println(parse);
    }
}
