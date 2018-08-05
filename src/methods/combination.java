package methods;

import java.util.*;

public class combination {



    /*
    nCr
     */
    public static int comb(int n, int r) {
        return permutation(n) / (permutation(r) * permutation(n - r));
    }

    public static int permutation(int i) {
        if (i == 1) {
            return 1;
        }
        return i * permutation(i - 1);
    }
}
