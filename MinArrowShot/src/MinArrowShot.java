import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class MinArrowShot {

    public static void main(String[] args) {
        int[][] arr = {{5, 10}, {8, 10}, {12, 18}, {10, 20}};
        System.out.println(minArrowShot(arr));
    }

    private static int minArrowShot(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int currEnd = points[0][1];
        int i = 1;
        int count = 0;
        while(i < points.length){
            if(points[i][0] > currEnd){
                count++;
                currEnd = points[i][1];
            }
            i++;
        }
        count++;
        return count;
    }
}
