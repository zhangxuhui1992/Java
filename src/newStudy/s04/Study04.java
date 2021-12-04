package newStudy.s04;

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
    }
}
