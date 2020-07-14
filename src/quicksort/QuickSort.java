package quicksort;


import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[]{4,8,5,7,9,1};

        System.out.println(Arrays.toString(nums));
    }


    private static void swap(int[] nums,int i,int j){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



