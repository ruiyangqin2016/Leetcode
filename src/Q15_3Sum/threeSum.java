package Q15_3Sum;

import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
//            if (i == 0 || (i > 0 && ))
        }
        return ret;
    }
}
