package Q63_UniquePathsII;

public class Solution {
    public static void main(String[] args) {
        int[][] obs = {
                {0, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 1},
//                {0, 1, 1, 1, 1, 1, 1},
//                {0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 1, 0, 1},
//                {1, 1, 0, 0, 0, 0, 1},
//                {0, 0, 0, 0, 0, 0, 0},
        };
        int num_paths = uniquePathsWithObstacles(obs);
        System.out.println(num_paths);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row: obstacleGrid){
            for (int j = 0; j < width; j++) {
                if (row[j] == 1) {
                    dp[j] = 0;
                } else if (j > 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[width - 1];
    }
}