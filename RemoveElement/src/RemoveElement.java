public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 2;
        Solution(nums, val);
    }

    static int Solution(int[] nums, int val) {
        if(nums.length == 0)
            return 0;

        int i = 0;
        int j = nums.length - 1;
        int length = 0;
        while (i <= j) {
            if(nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                i++;
                length++;
            }
        }
        return length;
    }
}
