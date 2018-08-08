package Q77_Combinations;

import Q24_SwapNodes.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        List<List<Integer>> ret = combine(n, k);
        int length = ret.size();
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(ret.get(i).toArray()));
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        helper(ret, n, k, new ArrayList<>(), 1);
        return ret;
    }

    private static void helper(List<List<Integer>> ret, int n, int k,
                               ArrayList<Integer> list,int index) {
        if (list.size() == k) {
            ret.add(new ArrayList<>(list));
        }

        for (int i = index; i <= n; i++) {
            list.add(i);
            helper(ret, n, k, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
