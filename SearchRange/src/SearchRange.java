import java.util.Arrays;

public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if(nums[mid] == target) {
                low = mid;
                high = mid;
                while (low > 0 && nums[low - 1] == target)
                    low--;
                while (high < nums.length - 1 && nums[high + 1] == target)
                    high++;
                return new int[] {low, high};
            } else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return new int[] {-1, -1};
    }
}
