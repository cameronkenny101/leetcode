public class HourGlass {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1 ,1, 0 ,0, 0}};
        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        int max = -Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = 0; j < arr[i].length - 2; j++) {
                int sum = 0;
                int x = i;
                boolean hourglass;
                boolean row = false;
                for(; x < i + 3; x++) {
                    if(x == i + 1)
                        hourglass = true;
                    else
                        hourglass = false;
                    for(int y = j; y < j + 3; y++) {
                        if(hourglass) {
                            if(row) {
                                row = false;
                            }
                            else {
                                row = true;
                                continue;
                            }
                        }
                        sum += arr[x][y];
                    }
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
