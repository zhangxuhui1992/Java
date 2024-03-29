package newStudy.s03;


import java.util.Arrays;

/**
 * @Author zhangxuhui
 * @Date 2021/12/3
 * @email zxh_1633@163.com
 * 运算符
 * 算术 逻辑 赋值 比较 位运算符 三元运算符
 */
public class Study03 {
    public static void main(String[] args) {
        System.out.println(4 / 3);//除取整
        System.out.println(20 % 3);//模取余

        byte b = 3;

        //b = b + 4;编译不通过，应为左边为byte类型右边为int类型
        b += 4;//+=有隐式的类型转换

        System.out.println(!false);

        System.out.println(3 << 2);//左移乘2的位数次幂 3*2的平方 = 12
        System.out.println(-12 >> 2);//右移除，原最高位是什么就补什么
        System.out.println(12 >>> 2);//无符号右移，空位都补零，用于二进制数据位移，数据截取。

        System.out.println(6 & 3);//用来获取二进制中的有效位1 110 & 011 = 010
        System.out.println(6 ^ 3);//异或
        System.out.println(6 ^ 3 ^ 3);//6
        System.out.println(~6);//取反 所以位取反
        System.out.println(~6);
        System.out.println(6 | 3);// 110 | 011 = 111
        System.out.println(6 & 7);//111

        System.out.println(Integer.toBinaryString(-2));//补码
        System.out.println(Integer.toBinaryString(2));//三码合一

//        System.out.println(~(11111111111111111111111111111110f -1));
//        System.out.println(~(11111111111111111111111111111110f -1));
        System.out.println("*******************");
        String str = "我爱中国";
        byte[] bytes = str.getBytes();
        for(byte by : bytes){
            System.out.println(by);
        }
        byte b1 = bytes[0];
        byte b2 = bytes[1];
        byte b3 = bytes[2];
        System.out.println("*******************");
        String s = new String(new byte[]{b1, b2, b3});
        System.out.println(s);

        System.out.println(canConstruct("a","b"));

        StringBuilder build = new StringBuilder("aaabbb");
        int d = build.indexOf("d");
        System.out.println(d);

        System.out.println(false?"good":"best");
    }

    /**
     * 为了不在赎金信中暴露字迹，从杂志上搜索各个需要的字母，组成单词来表达意思。
     *
     * 给你一个赎金信 (ransomNote) 字符串和一个杂志(magazine)字符串，判断 ransomNote 能不能由 magazines 里面的字符构成。
     *
     * 如果可以构成，返回 true ；否则返回 false 。
     *
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/ransom-note
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        char [] tar = ransomNote.toCharArray();
        char [] con = magazine.toCharArray();
        boolean flag = true;
        for(char ch : tar){
            Arrays.sort(con);
            int index = Arrays.binarySearch(con,ch);
            System.out.println(index);
            if( index <= -1){
                return false;
            }
            con[index] = ' ';
        }
        return flag;
    }

}
