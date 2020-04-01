package test.javase;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-17 13:29
 * 命令行参数
 */
public class jvm {
    public static void main(String[] args) {
        /**
         * jiujiu乘法表
         */
        for(int i = 1 ; i < 10 ; i++){
            for(int k = 1 ; k < i +1; k++){
                System.out.print(k+"*"+i+"="+i*k+"\t");
            }
            System.out.println();
        }
    }
}
