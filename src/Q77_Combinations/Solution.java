package Q77_Combinations;

import Q24_SwapNodes.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

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
