package Q35_Search;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int index = searchInsert(nums, target);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        while (index <= nums.length - 1 && target > nums[index]) index++;

        return index;
    }
}
