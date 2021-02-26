public class Ponds {

    public static void main(String[] args) {
        int[][] island = {{0, 1, 0, 1, 2},
                         {1, 0, 0, 1, 2},
                         {1, 1, 0, 1, 2},
                        {0, 1, 1, 1, 0}};
        System.out.println(numIslands(island));

    }

    public static int numIslands(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j< grid[i].length; j++) {
                if(grid[i][j]==0){
                    count++;
                    merge(grid, i, j);
                }
            }
        }

        return count;
    }

    public static void merge(int[][] grid, int i, int j){

        if(i < 0 || i >= grid.length || j < 0 ||j >= grid[i].length || grid[i][j]!=0)
            return;

        grid[i][j] = -1;

        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
}
