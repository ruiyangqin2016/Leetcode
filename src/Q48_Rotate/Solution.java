package Q48_Rotate;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {5, 1, 9, 11},
//                {2, 4, 8, 10},
//                {13, 3, 6, 7},
//                {15, 14, 12, 16}
//        };
        int[][] matrix = {
                {1}
        };
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.print("\n");
        rotate(matrix);
        System.out.print("\n");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
//        System.out.print("\n");
    }

    public static void rotate(int[][] matrix) {
        int x = matrix[0].length;
        int y = x;
        int[][] temp = new int[x][y];
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                temp[i][x - 1 - j] = matrix[j][i];
            }
        }
//        matrix = temp;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
