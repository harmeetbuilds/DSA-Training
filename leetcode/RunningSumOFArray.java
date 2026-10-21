package leetcode;

import java.util.Arrays;

public class RunningSumOFArray {
    
    public static int[] runningSum(int[] nums) {

        int arr[] = new int[nums.length];
        int result = 0;

        for (int i = 0; i < nums.length; i++) { 
            result = result + nums[i];   
            arr[i] = result;
        }

        return arr; 
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17};

        int[] result = runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}       