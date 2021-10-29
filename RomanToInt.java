package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    int romanToInt(String str) {
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i > 0 && numbersMap.get(ch) > numbersMap.get(str.charAt(i - 1))) {
                result += numbersMap.get(ch) - 2 * numbersMap.get(str.charAt(i - 1));
            } else {
                result += numbersMap.get(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInt rom = new RomanToInt();
        System.out.println(rom.romanToInt("LIX")); //49
    }
}
