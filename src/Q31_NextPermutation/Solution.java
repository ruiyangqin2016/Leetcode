package Q31_NextPermutation;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1}; // 2, 3, 1
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int pos = 0;
        for (int i = nums.length - 1; i >0; i--) {
            if (nums[i] > nums[i - 1]) {pos = i; break;}
        }
        reverse(nums, pos, nums.length - 1);
        if (pos > 0) {
            int i = binarySearch(nums, nums[pos - 1], pos, nums.length - 1);
            swap(nums, pos - 1, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            swap(nums, lo++, hi--);
        }
    }

    private static int binarySearch(int[] nums, int target, int lo, int hi) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    //==========================================================================

//    public static void nextPermutation(int[] nums) {
//        if (nums.length != 0) {
//            helper(nums);
//        }
//    }
//
//    private static void helper(int[] nums) {
//        int index_temp_nums = 0;
//        int[] temp_nums = new int[nums.length];
//        for (int i = nums.length - 1; i > 0; i--) {
//            if (nums[i] > nums[i - 1]) {
//                reverse(nums, i, nums.length - 1);
//                swap(nums, i, i - 1);
//                return;
//            }
//            temp_nums[index_temp_nums] = nums[i];
//            index_temp_nums++;
//        }
//        temp_nums[nums.length - 1] = nums[0];
//        for (int i = 0; i < temp_nums.length; i++) {
//            nums[i] = temp_nums[i];
//        }
//        return;
//    }
//
//    private static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
//
//    private static void reverse(int[] nums, int lo, int hi) {
//        while (lo < hi) {
//            swap(nums, lo++, hi--);
//        }
//    }
}
