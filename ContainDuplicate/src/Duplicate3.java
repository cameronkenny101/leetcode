import java.util.HashMap;

public class Duplicate3 {

    public static void main(String[] args) {

    }

    public static boolean contain(int[] arr, int k, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i] - t))
        }
    }
}
