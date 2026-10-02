package leetcode;

import java.util.Arrays;

public class shuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n + i];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        System.out.println(Arrays.toString(result));
    }
}
