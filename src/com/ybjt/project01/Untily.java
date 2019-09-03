package com.ybjt.project01;

import java.util.Scanner;

/**
 * @author zxh
 * @create 2019-09-03 21:30
 */
public class Untily {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 从键盘获取指定长度的字符串
     * @return
     */
    public static String readKeyBorad(int limit) {
        String line = "";
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入的长度不合法,不应超过：" + limit);
                continue;
            }else {
                break;
            }

        }
        return line;
    }
}
