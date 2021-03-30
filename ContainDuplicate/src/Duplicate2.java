import java.util.HashMap;

public class Duplicate2 {

    public static void main(String[] args) {
        System.out.println(containDuplicate(new int[] {1, 2, 3, 1}, 3));
    }

    public static boolean containDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                if(Math.abs(map.get(num) - i) <= k)
                    return true;
            }
            map.put(num, i);
            i++;
        }
        return false;
    }
}
