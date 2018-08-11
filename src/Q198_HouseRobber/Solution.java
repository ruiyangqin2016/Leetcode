package Q198_HouseRobber;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {19, 13, 9, 100, 10};
        int ans = rob(nums);
        System.out.println(ans);
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] money = new int[nums.length];

        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            money[i] = Math.max(nums[i] + money[i - 2], money[i - 1]);
        }

        return money[nums.length - 1];
    }
}
