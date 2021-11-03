package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Character c;
        Character y;
        Map<Character, Integer> table = new HashMap<>();

        for (int j = 0; j < jewels.length(); j++) {
            y = jewels.charAt(j);
            table.put(y, j);

        }
        for (int i = 0; i < stones.length(); i++) {
            c = stones.charAt(i);
            if (table.get(c) != null) {
                count++;
            }
        }
        return count;
    }

}
