package LeetCode;

public class ReverseInt {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length-1;
        System.out.println(n);
        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
