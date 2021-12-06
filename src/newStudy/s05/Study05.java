package newStudy.s05;

/**
 * @Author zhangxuhui
 * @Date 2021/12/6
 * @email zxh_1633@163.com
 */
public class Study05 {
    public static void main(String[] args) {
        getZ(4,4);
    }

    /**
     * 打印正方形
     */
    public static void getZ(int row,int col){
        for(int i = 0; i < row ; i++){
            for (int k = 0 ; k < col;k++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
