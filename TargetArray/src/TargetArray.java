import java.util.Arrays;

public class TargetArray {

    public static void main(String[] args) {
        int[] arr = {1000000000};
        System.out.println(minOperations(arr));
    }

    public static int minOperations(int[] nums) {
        int maxDivides = 0;
        int decrement = 0;
        for (int num : nums) {
            int divides = 0;
            while (num != 0) {
                if (num % 2 == 0) {
                    divides++;
                    num /= 2;
                } else {
                    num--;
                    decrement++;
                }
            }
            maxDivides = Math.max(divides, maxDivides);
        }
        return decrement + maxDivides;
    }
}
