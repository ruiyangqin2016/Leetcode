package Q49_Group;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] strs = {"hos","boo","nay","deb","wow", "bop",
                "bob","brr","hey","rye","eve", "elf",
                "pup","bum","iva","lyx","yap", "ugh",
                "hem","rod","aha","nam","gap", "yea",
                "doc","pen","job","dis","max", "oho",
                "jed","lye","ram","pup","qua", "ugh",
                "mir","nap","deb","hog","let", "gym",
                "bye","lon","aft","eel","sol","jab"};
        List<List<String>> result = groupAnagrams(strs);
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(Arrays.toString(result.get(i).toArray()));
//        }
        System.out.println(Arrays.toString(result.toArray()));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> ans = new HashMap<>();
        for (String s: strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());

    }
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> ret = new ArrayList<>();
//        Map<Set<Character>, Integer> coordinate = new HashMap<>();
//        int coord = 0;
//        Set<Set<Character>> hold = new HashSet<>();
//        for (int i = 0; i < strs.length; i++) {
//            String temp = strs[i];
//            Set<Character> set = new HashSet<>();
//            for (int j = 0; j < temp.length(); j++) {
//                set.add(temp.charAt(j));
//            }
//            if (hold.contains(set)) {
//
//                /*
//                add to original list
//                 */
//                int getCoord = coordinate.get(set);
//                ret.get(getCoord).add(temp);
//            } else {
//                /*
//                create a new list
//                 */
//                hold.add(set);
//                List<String> newList = new ArrayList<>();
//                newList.add(temp);
//                ret.add(newList);
//                coordinate.put(set, coord);
//                coord++;
//            }
//
//        }
//        return ret;
//    }
}
