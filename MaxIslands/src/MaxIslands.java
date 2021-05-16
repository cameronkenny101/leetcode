public class MaxIslands {

    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},
                        {1,1,0,0},
                        {1,1,1,0}};
        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(grid, i, j, 0);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private static int dfs(int[][] grid, int i, int j, int count) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != 1)
            return count;

        count++;
        grid[i][j] = 0;
        count = dfs(grid, i - 1, j, count);
        count = dfs(grid, i + 1, j, count);
        count = dfs(grid, i, j - 1, count);
        count = dfs(grid, i, j + 1, count);

        return count;
    }
}
