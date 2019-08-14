package com.ybjt.utils;

import java.util.Scanner;

/**
 * 获取键盘输入的工具类
 * @author zxh
 * @create 2019-08-14 8:51
 * 静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员.
 * 如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量
 * 在普通成员方法中，则可以直接访问同类的非静态变量和静态变量
 * 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法
 * 静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
 * 程序运行时静态初始化块最先被执行，然后执行普通初始化块，最后才执行构造方法。
 */
public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 获取整数
     * @return
     */
    public static int getInt(){
        return scanner.nextInt();
    }

    /**
     * 获取字符串
     * @return
     */
    public static String getString(){
        return scanner.nextLine();
    }

    /**
     * 获取字符
     * @return
     */
    public static char getChar(){
        return getString().charAt(0);
    }

    public static String readKeybored(){
        String str = null;
        //别写死循环
        while (scanner.hasNextLine()){
            str = scanner.nextLine();
            if(str != null){
                break;
            }
        }
        return str;
    }
}
