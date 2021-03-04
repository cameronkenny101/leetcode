public class AerialRecon {

    boolean enemyShip = false;

    public static void main(String[] args) {
        AerialRecon recon = new AerialRecon();
        int[][] arr = {
                {2, 1, 0, 0, 2},
                {3, 2 ,2, 2 ,1},
                {1, 2 ,1 ,2 ,3},
                {3, 2 ,3 ,2 ,2},
                {1, 2 ,1 ,2 ,1},
                {1, 2 ,2 ,2 ,1},
                {2 ,3, 3 ,2, 2}};
        System.out.println(recon.ships(arr));
    }

    public int ships(int[][] arr) {
        int enemy = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 2) {
                    dfs(arr, i, j);
                    if(enemyShip)
                        enemy += 1;
                }
                enemyShip = false;
            }
        }
        return enemy;
    }

    public void dfs(int[][] arr, int i, int j) {
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 2)
            return;

        if(arr[i][j] == 3) {
            enemyShip = true;
        }

        arr[i][j] = 2;
        dfs(arr, i + 1, j);
        dfs(arr, i - 1, j);
        dfs(arr, i, j + 1);
        dfs(arr, i, j - 1);
    }
}
