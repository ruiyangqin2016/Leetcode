package Q50_Pow;

import java.util.Map;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(Math.pow(2, 2147483647) + " " + Integer
//                .MIN_VALUE);
        System.out.println(Pow(2,2));
    }

    public static double Pow(double x, int n) {

        if (n == 0) return 1;
        if (x == 0) return 0;
        if (x == 1) return 1;

        double ret = 1.0;
        long neg = (n < 0) ? ((long)n * -1) : n;

        while (neg > 0) {
            long hold = neg & 1;
            if (hold == 1) {
                ret *= x;
            }
            x *= x;
            neg >>= 1;
        }

        if (n < 0) {
            return 1 / ret;
        } else {
            return ret;
        }
    }
}
