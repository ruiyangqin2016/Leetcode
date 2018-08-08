package Q66_PlusOne;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] digits = {9};
        digits = plusOne(digits);
        System.out.println(Arrays.toString(digits));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int length = digits.length;
        int index = length - 1;
        int[] ret = new int[length];
        int[] backup = new int[length + 1];
        while (index >= 0 || carry == 1) {
            if (index < 0 && carry == 1) {
                backup[0] = carry;
                for (int i = 1; i < length + 1; i++) {
                    backup[i] = ret[i - 1];
                }
                return backup;
            }

            int temp_sum = 0;
            if (index == length - 1) {
                temp_sum = 1 + carry + digits[index];
            } else if (carry != 0){
                temp_sum = digits[index] + carry;
            } else {
                temp_sum = digits[index];
            }
            if (temp_sum < 10) {
                ret[index] = temp_sum;
                carry = 0;
            } else {
                ret[index] = temp_sum - 10;
                carry = 1;
            }
            index--;
        }
        return ret;
    }
}
