package com.ybjt.test;

import com.ybjt.utils.ScannerUtil;

/**
 * @author zxh
 * @create 2019-08-14 9:02
 */
public class TestScanner {
    public static void main(String[] args) {
        /*int num = ScannerUtil.getInt();
        System.out.println(num);*/
      /*  String str = ScannerUtil.getString();
        System.out.println(str+"123");*/

        String str = ScannerUtil.readKeybored();
        System.out.println(str);
    }
}
