package Q15_3Sum;

import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Set<Set<Map<Integer, Integer>>> comb = new HashSet<>();
        List<Map<Integer, Integer>> numsMap = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> temp = new HashMap<>();
            temp.put(i, nums[i]);
        }

        int i = 0;
        while (numsMap.size() != 0) {

        }


        return ret;
    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> rettemp = new ArrayList<>();
//        Set<Set<Integer>> duplicate = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                for (int k = 0; k < nums.length; k++) {
//                    List<Integer> hold = new ArrayList<>();
//                    Set<Integer> tempSet = new HashSet<>();
//                    tempSet.add(nums[i]);
//                    tempSet.add(nums[j]);
//                    tempSet.add(nums[k]);
//
//                    hold.add(nums[i]);
//                    hold.add(nums[j]);
//                    hold.add(nums[k]);
//                    if (!duplicate.contains(tempSet)) {
//                        rettemp.add(hold);
//                        duplicate.add(tempSet);
//                    }
//                }
//            }
//        }
//
//        List<List<Integer>> ret = new ArrayList<>();
//        for (int i = 0; i < rettemp.size(); i++) {
//            List<Integer> temp = rettemp.get(i);
//            int sum = 0;
//            for (int j = 0; j < temp.size(); j++) {
//                sum += temp.get(j);
//            }
//            if (sum == 0) {
//                ret.add(temp);
//            }
//        }
//
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 0; i < ret.size(); i++) {
//            ans.add(ret.get(i));
//        }
//
//        for (int i = 0; i < ans.size(); i++) {
//            List<Integer> numsSet = new ArrayList<>();
//            for (int j = 0; j < nums.length; j++) {
//                numsSet.add(nums[j]);
//            }
//            List<Integer> one = ans.get(i);
//
//            for (int k = 0; k < one.size(); k++) {
//                if (numsSet.contains(one.get(k))) {
//                    numsSet.remove(one.get(k));
//                } else {
//                    ret.remove(one);
//                    k = one.size();
//                }
//            }
//
//        }
////        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(ret.toArray()));
//        return ret;
//    }



    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        threeSum(nums);
    }

}
