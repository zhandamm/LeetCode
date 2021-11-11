package LeetCode;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1; // -1 из-за того что нам нужно обращатся к элементам по индексу от 0 до 6

        while(start <=end){
            int mid = (start + end) /2;


            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid -1;
            }
            if(nums[mid] < target){
                start = mid +1 ;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12, 9};
        System.out.println(binarySearch(arr, 9));
    }
}
