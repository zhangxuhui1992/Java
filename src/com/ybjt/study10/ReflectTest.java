package com.ybjt.study10;

import com.ybjt.bean.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zxh
 * @create 2019-11-20 21:40
 */
public class ReflectTest {
    @Test
    public void test() throws Exception {
        Class<User> clazz = User.class;
        Constructor<User> constructor = clazz.getConstructor(String.class);
        User user = constructor.newInstance("张三");
        System.out.println(user);

        Method song = clazz.getMethod("song");
        song.invoke(user);

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(user,"28");
        System.out.println(user);
    }
}