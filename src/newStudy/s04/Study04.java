package newStudy.s04;

import java.util.Scanner;

/**
 * @Author zhangxuhui
 * @Date 2021/12/4
 * @email zxh_1633@163.com
 * 流程控制语句
 */
public class Study04 {
    public static void main(String[] args) {
        boolean flag = 3 > 4;
        if(flag){
            System.out.println("good");
        }else{
            System.out.println("not good");
        }

        /**
         * 否定前面再执行
         * 只会执行一次
         */
        int x = 4;
        if(x > 5){
            System.out.println(1);
        }else if(x > 2){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
        String s = "3";
        switch(s){
            case "3":
                System.out.println(s);
                break;
            case "4":
                System.out.println("4");
                break;
            case "5":
                System.out.println("5");
                break;
            default:
                System.out.println("JAVA");
        }

        getWeak();
    }

    /**
     * 输出对应的星期
     */
    public static void getWeak(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        while (true){
            int i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                default:
                    System.out.println("不知道！");
            }
        }
    }
}
