package Q46_Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

//    static List<List<Integer>> ret = new ArrayList<>();
    public static void main(String[] args) {
        int[] a = {1};
        List<List<Integer>> ret = new ArrayList<>();
        perm2(a, a.length, ret);
        System.out.println(Arrays.toString(ret.toArray()));
    }

    private static void perm2(int[] a, int n, List<List<Integer>> ret) {
        if (n == 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                temp.add(a[i]);
            }
            ret.add(temp);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1, ret);
            swap(a, i, n-1);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
}
