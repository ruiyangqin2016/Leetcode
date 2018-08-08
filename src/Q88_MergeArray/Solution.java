package Q88_MergeArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        int m = 1, n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp_nums1 = new int[nums1.length];
        int i_m = 0, i_n = 0, i = 0;
        if (n == 0 || m == 0) {
            if (m == 0 && n == 0) {
                return;
            }
            if (m != 0 && n == 0) {
                return;
            }
        }
        while (i_m < m || i_n < n) {
            if (i_m != m && i_n != n && nums1[i_m] <= nums2[i_n]) {
                temp_nums1[i] = nums1[i_m];
                i_m++;
            } else if (i_m != m && i_n != n && nums1[i_m] > nums2[i_n]) {
                temp_nums1[i] = nums2[i_n];
                i_n++;
            } else {
                if (i_m != m) {
                    temp_nums1[i] = nums1[i_m];
                    i_m++;
                } else {
                    temp_nums1[i] = nums2[i_n];
                    i_n++;
                }
            }
            i++;
        }

        for (int j = 0; j < temp_nums1.length; j++) {
            nums1[j] = temp_nums1[j];
        }
    }
}
