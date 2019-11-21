package com.ybjt.study10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zxh
 * @create 2019-11-21 12:24
 */
public class ProxyTest {
    public static void main(String[] args) {
        SupperMan supperMan = new SupperMan();
        Man proxyInstance = (Man) ProxyFactory.getProxyInstance(supperMan);
        proxyInstance.getBelive();
        proxyInstance.eat("麻辣汤");
    }
}

/**
 * 接口定义功能
 */
interface Man{
    public void getBelive();
    public void eat(String food);
}

/**
 * 被代理类
 */
class SupperMan implements Man{

    @Override
    public void getBelive() {
        System.out.println("I belive I can Fly");
    }

    @Override
    public void eat(String food) {
        System.out.println("超人喜欢吃"+food);
    }
}

/**
 * 获取代理类对象
 */
class ProxyFactory{
    public static Object getProxyInstance(Object obj){
        MyHandel handel = new MyHandel(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handel);
    }
}

class MyHandel implements InvocationHandler{

    private Object object;

    public MyHandel(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}

