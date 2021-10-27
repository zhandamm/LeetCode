package LeetCode;

public class TwoSum {
    public void twoSum(int[] nums, int target) {
        int sum;

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    nums = new int[]{i, j};
                }
            }
        }
        System.out.println(nums[0] + " " + nums[1]);
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
       twoSum.twoSum(new int[]{1,2,3,4}, 6); // Output: 1,3;


    }
}
