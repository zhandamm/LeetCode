package LeetCode;

import java.util.Arrays;

// Учитывая двоичный массив nums, вернуть максимальное количество последовательных 1в массиве .

public class Ones {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 0, 1, 1, 1};
        int maxCount = 0;
        int currentCount = 0;

        for (int number : nums) {
            if (number == 1) {
                currentCount++;
            } else {
                currentCount = 0;
            }
            maxCount = Math.max(maxCount, currentCount);
        }


        System.out.println(maxCount);
    }
}
