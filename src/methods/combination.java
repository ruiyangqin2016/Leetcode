package methods;

import java.util.*;

public class combination {
    public static void main(String[] args) {
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String digits = "567";
        List<String> result = new ArrayList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            result = combination(digitletter[digits.charAt(i) - '0'], result);
        }
        System.out.println(Arrays.toString(result.toArray()));
    }



    /*
    nCr
     */
    public static int comb(int n, int r) {
        return permutation(n) / (permutation(r) * permutation(n - r));
    }

    public static int permutation(int i) {
        if (i == 1) {
            return 1;
        }
        return i * permutation(i - 1);
    }

    /*
    Combination
     */
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
