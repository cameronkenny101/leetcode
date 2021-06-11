public class UniquePaths2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0] = 1;
        if(obstacleGrid[0][0] == 1)
            return 0;
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                if(obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else if(j - 1 < 0) {
                    if (i > 0)
                        dp[i][j] = dp[i - 1][j];
                } else if(i - 1 < 0) {
                        dp[i][j] = dp[i][j - 1];
                } else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
