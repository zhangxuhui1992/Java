package com.ybjt.study07;

/**
 * @author zxh
 * @create 2019-11-11 17:36
 */
public class VsCode {
    public static void main(String[] args) {
        int [] arr =new int []{1,1,2,2,3};
        int d = removeDuplicates(arr);
        System.out.println(d);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0 ;i < nums.length;i++){
            for(int j = 0 ;j<i+1;j++){
                if(i == 0){
                    count++;
                    break;
                }else{
                    if(nums[i] != nums[j]){
                        nums[count] = nums[i];
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}
