package com.ybjt.study02;

/**
 * break:使用在switch...case...或者循环结构中，结束当前循环。
 * continue：使用在循环结构中，结束当次循环。
 * 两者后面都不能声明执行语句
 * @author zxh
 * @create 2019-09-02 22:18
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            if(i == 4){
                //break;//123
                continue;//1235678910
            }
            System.out.println(i);
        }
    }
}
