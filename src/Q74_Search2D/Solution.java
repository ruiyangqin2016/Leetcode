package Q74_Search2D;

public class Solution {
    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 3, 5, 7},
//                {10, 11, 16, 20},
//                {23, 30, 34, 50}
//        };
        int[][] matrix = {
                {1},
                {3}
        };
        boolean exist = searchMatrix(matrix, 1);
        System.out.println(exist);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        boolean exist = false;
        int length_row = matrix[0].length;
        int height_column = matrix.length;
        int row = 0;
        int mark = 0;
        while (row < height_column) {
            if (matrix[row].length == 0) {
                return false;
            }
            if (matrix[row][length_row - 1] >= target) {
                mark = row;
                row = height_column;
            } else {
                row++;
            }
        }

        int[] filteredArr = matrix[mark];
        int length_filterArr = filteredArr.length;
        for (int i = 0; i < length_filterArr; i++) {
            if (filteredArr[i] == target) {
                exist = true;
                i = length_filterArr;
            }
        }
        return exist;
    }
}
