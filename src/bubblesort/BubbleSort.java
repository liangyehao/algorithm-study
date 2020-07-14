package bubblesort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 *  4,8,5,7,9,1
 *
 * （1） 4,5,7,8,1,9
 * （2） 4,5,7,1,8,9
 * （3） 4,5,1,7,8,9
 * （4） 4,1,5,7,8,9
 * （5） 1,4,5,7,8,9
 * @author liangyehao
 * @date 2020/07/14
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{4,8,5,7,9,1,2,6,11};

        // 1.要走nums.length-1轮
        for (int i = 0; i < nums.length - 1; i++) {
            // 2.每轮要比较nums.length-1-i次
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums,int i,int j){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}