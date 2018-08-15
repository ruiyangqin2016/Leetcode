package Q242_ValidAnagram;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s_charArr = s.toCharArray();
        char[] t_charArr = t.toCharArray();
        Arrays.sort(s_charArr);
        Arrays.sort(t_charArr);
        return Arrays.equals(s_charArr, t_charArr);
    }
}
