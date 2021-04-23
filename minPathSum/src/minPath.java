public class minPath {

    public static void main(String[] args) {
        int[][] grid = {{7, 4, 5}, {0, 8, 3}};
        System.out.println(path(grid, 0, 0));
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
}
