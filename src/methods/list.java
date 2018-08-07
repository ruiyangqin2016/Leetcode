package methods;

import java.util.Arrays;

public class list {
    public static void main(String[] args) {
        String[] a = {"ehfiawu", "b", "c", "d"};
        char[] ca = a[0].toCharArray();
        Arrays.sort(ca);
        String key = String.valueOf(ca);
        System.out.println(key);
        System.out.println(Arrays.toString(ca));
//        System.out.println(Arrays.toString(a));
//        a[1] = null;
//        System.out.println(Arrays.toString(a));
    }
}
