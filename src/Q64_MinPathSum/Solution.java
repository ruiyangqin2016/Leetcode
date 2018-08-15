package Q64_MinPathSum;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 5},
                {3, 2, 1},
//                {4, 2, 1},
        };
        int ans = minPathSum(grid);
        System.out.println(ans);
    }

    public static int minPathSum(int[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 && j != 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (i != 0 && j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                } else if (i == 0 && j == 0) {
                    grid[i][j] = grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j]) +
                            grid[i][j];
                }
            }
        }
        return grid[height - 1][width - 1];
    }
}
