package test.javase.array;

import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-13 16:51
 */
public class ShowArray {
    public static void main(String[] args) {
        //数组声明的三种方式
        int [] arr = new int [5];

        String [] str = new String [] {"a","b"};

        char [] ch = {'a','b','c'};

        String s = Arrays.toString(str);
        System.out.println(s);

        /**
         * 源码分析：
         *
         * public static String toString(Object[] a) {
         *          为空直接返回null
         *         if (a == null)
         *             return "null";
         *          获取数组索引的最大值
         *         int iMax = a.length - 1;
         *           如果数组索引的最大值为-1,此数组为空数组，直接返回[]
         *         if (iMax == -1)
         *             return "[]";
         *            线程不安全，但是效率较高的字符序列
         *         StringBuilder b = new StringBuilder();
         *         b.append('[');
         *         没有判断条件,不进行判断，默认为true，循环的结束条件在循环内控制
         *         for (int i = 0; ; i++) {
         *             字符序列追加->将Object类型转为String
         *             b.append(String.valueOf(a[i]));
         *             如果i等于了数组的最大索引则追加结束符号]，return返回，结束程序。
         *             if (i == iMax)
         *                 return b.append(']').toString();
         *             如果i还没有等于数组的最大索引，则追加","
         *             b.append(", ");
         *         }
         *     }
         *
         *     程序输出效果为：
         *          [1,2,3,4]
         */
    }
}
