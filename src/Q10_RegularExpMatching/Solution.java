package Q10_RegularExpMatching;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String s = "aaaac.";
        String p = "a*ac.";
        boolean isMatch = isMatch(s, p);
        System.out.println(isMatch);
    }

    public static boolean isMatch(String s, String p) {
        char[] s_copy = s.toCharArray();
        char[] p_tempCopy = p.toCharArray();
        String p_copy = "";
        int s_length = s.length(), p_length = p.length();
        int s_index = 0, p_index = 0;
        for (int i = 0; i < Math.max(s_length, p_length); i++) {
            if (p_index == p.length() || s_index == s_length || p_tempCopy[0] == '*') {
                return false;
            }
            char s_temp = s_copy[s_index];
            char p_temp = p_tempCopy[p_index];

            if (p_temp == s_temp) {
                p_copy += p_temp +"";
                p_index++;
                s_index++;
            }
            else if (p_temp == '.') {
                p_copy += s_temp +"";
                p_index++;
                s_index++;
            }
            else if (p_temp == '*') {
                if (p_tempCopy[p_index - 1] == '.') {
                    while (s_index < s_length && s_copy[s_index] == s_temp) {
                        p_copy += s_temp + "";
                        s_index++;
                    }
                    p_index++;
                } else {
                    if (p_tempCopy[p_index - 1] == s_copy[s_index]) {
                        while (s_index < s_length && s_copy[s_index] == s_temp) {
                            p_copy += s_temp + "";
                            s_index++;
                        }
                        s_index++;
                        p_index++;
                    } else {
                        p_index++;
                    }
                }
            }
            else if (p_temp != s_temp) {
                p_index++;
            }
        }
        return p_copy.equals(s);
    }
}
