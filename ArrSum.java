package LeetCode;

import java.util.Arrays;

public class ArrSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] += nums[i-1];
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
    }
}
