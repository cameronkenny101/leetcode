import java.util.HashMap;
import java.util.HashSet;

public class Duplicate {

    public static void main(String[] args) {
        System.out.println(containDuplicate(new int[] {1, 2, 3, 1}));
    }

    public static boolean containDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
