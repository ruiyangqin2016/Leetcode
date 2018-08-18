package Q17_LetterCombo;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String digits = "34";
        if (digits.equals("")) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.toString(letterCombinations(digits).toArray()));
        }
    }

    public static List<String> letterCombinations(String digits) {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combination(digitletter[digits.charAt(i) - '0'], result);
        }
        return result;
    }

    private static List<String> combination(String arr, List<String> temp) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            for (String x: temp) {
                ret.add(x + arr.charAt(i));
            }
        }
        return ret;
    }
}
