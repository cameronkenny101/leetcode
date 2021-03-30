public class LargestTime {

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4};
        System.out.println(largestTime(arr));
    }

    public static String largestTime(int[] arr) {
        StringBuilder ans = new StringBuilder();
        int[] nums = new int[10];
        for (int j : arr)
            nums[j]++;
        int zeroToOne = nums[0] + nums[1];
        int zeroToThree = zeroToOne + nums[2] + nums[3];
        int zeroToFive = zeroToThree + nums[4] + nums[5];

        if(nums[2] > 0 && zeroToThree >= 2 && zeroToFive >= 3) {
            return ans.append(remove(nums, 2)).append((remove(nums, 3))).append(":").append(remove(nums, 5)).append(remove(nums, 9)).toString();
        } else if(zeroToOne >= 1 && zeroToFive >= 2) {
            return ans.append(remove(nums, 1)).append((remove(nums, 9))).append(":").append(remove(nums, 5)).append(remove(nums, 9)).toString();
        }
        return "";
    }

    private static int remove(int[] nums, int limit) {
        for(int i = limit; i != -1; i--) {
            if(nums[i] > 0) {
                nums[i]--;
                return i;
            }
        }
        throw new IllegalStateException();
    }
}
