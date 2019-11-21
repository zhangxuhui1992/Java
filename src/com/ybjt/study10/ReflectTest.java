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

    /**
     * 获取Class类的实例
     */
    @Test
    public void test2() throws Exception {
        //方式一
        Class<User> userClass = User.class;
        User user1 = userClass.newInstance();//调用空参的构造器，访问权限够访问。
        System.out.println(userClass.toString());
        //方式二
        User user = new User("张三");
        Class<? extends User> aClass = user.getClass();
        System.out.println(aClass.toString());
        //方式三
        Class<?> aClass1 = Class.forName("com.ybjt.bean.User");
        Constructor<?> constructor = aClass1.getConstructor(String.class);
        Object o = constructor.newInstance("李四");
        Field age = aClass1.getDeclaredField("age");
        Field address = aClass1.getDeclaredField("address");
        address.setAccessible(true);
        address.set(o,"中关村");
        age.setAccessible(true);
        age.set(o,"28");
        System.out.println(o.toString());

        //方式四 使用类的加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("com.ybjt.bean.User");
        System.out.println(aClass2);

    }
    
    @Test
    public void test4(){
        Class<User> userClass = User.class;

        Field[] fields = userClass.getDeclaredFields();

        for(Field f : fields){
            System.out.println(f);
        }
    }
}