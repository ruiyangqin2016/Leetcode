package Q13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "MCMXCIV";
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
        boolean trigger = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (trigger) {
                sum -= table.get(s.charAt(i));
            } else {
                sum += table.get(s.charAt(i));
            }
            if (i != 0 && table.get(s.charAt(i)) > table.get(s.charAt(i - 1))) {
                trigger = true;
            } else {
                trigger = false;
            }
        }
        return sum;
    }
}
