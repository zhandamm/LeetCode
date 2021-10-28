package LeetCode;

public class PalindromNumber {

    public boolean isPalindrome(int num) {
        int number = num;
        int reverse = 0;

        if (num >= 0) {
            while (num != 0) {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            return number == reverse;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromNumber pal = new PalindromNumber();
        System.out.println(pal.isPalindrome(-121));
    }
}
