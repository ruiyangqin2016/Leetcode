package Q29_Divide;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int dividend = -2147483648;
        int divisor = 1;
        int outcome = 0;
        if (divisor == 0) {
            outcome = 0;
        }

        if (dividend < Integer.MIN_VALUE || divisor < Integer.MIN_VALUE) {
            outcome = Integer.MIN_VALUE;
        }
        if (dividend > Integer.MAX_VALUE || divisor > Integer.MAX_VALUE) {
            outcome = Integer.MAX_VALUE;
        }

        int neg = 1;
        if ((dividend < 0 || divisor < 0) && !(dividend < 0 && divisor < 0)) {
            neg = -1;
        }

        if (dividend < 0) {
//            if (dividend == Integer.MIN_VALUE) {
//                dividend = Integer.MAX_VALUE;
//            } else {
                dividend = ~dividend + 1;
//            }
        }
        if (divisor < 0) {
            divisor = ~divisor + 1;
        }

//        int outcome = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            outcome++;
        }

        outcome = outcome * neg;
        System.out.println(outcome);
    }
}
