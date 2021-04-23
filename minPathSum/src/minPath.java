public class minPath {

    public static void main(String[] args) {
        int[][] grid = {{7, 4, 5}, {0, 8, 3}};
        System.out.println(DpPath(grid));
    }

    public static int path(int[][] grid, int i, int j) {
        // Base Case
        if(grid.length == i - 1 && grid[0].length == j - 1)
            return grid[i][j];

        // Two choices. Move Down or move right
        boolean downPossible = true, upPossible = true;
        // 1. Move Down
        int down = 0;
        if(i < grid.length - 1)
            down = path(grid, i + 1, j);
        else
            downPossible = false;
        // 2. Move right
        int right = 0;
        if(j < grid[0].length - 1)
            right = path(grid, i, j + 1);
        else
            upPossible = false;
        if(upPossible && downPossible)
            return grid[i][j] + Math.min(right, down);
        else if(downPossible)
            return grid[i][j] + down;
        else
            return grid[i][j] + right;
    }

    public static int DpPath(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j];
                if(i > 0 && j > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
                } else if(i > 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if(j > 0)
                    dp[i][j] += dp[i][j - 1];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
