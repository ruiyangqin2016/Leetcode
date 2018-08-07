package Q17_LetterCombo;

import java.util.*;

public class Solution {
    public static List<String> letterCombinations(String digits) {
        Map<Character, String> dict = new HashMap<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");

        List<String> strArr = new ArrayList<>();
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            strArr.add(dict.get(digits.charAt(i)));
        }
        dfs(ret, strArr);
        return ret;
    }

    private static void dfs(List<String> ret, List<String> strArr) {
//        if (strArr == null) {
//            return;
//        }
//        for (Character c: strArr.get(0).toCharArray()) {
//            dfs();
//        }

    }
}
