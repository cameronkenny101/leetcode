public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-2, 2, 5, 6, 9, 12};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (high + low) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
