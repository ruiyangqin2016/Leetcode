package Q13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "III";
        int ans = romanToInt(s);
        System.out.println(ans);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = table.get(s.charAt(i));

        }

        return sum;
    }
}
