package LeetCode;

import java.util.Arrays;

public class SmallNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && i != j) {
                    count++;
                    countArr[i] = count;
                }
            }
        }
        return countArr;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
