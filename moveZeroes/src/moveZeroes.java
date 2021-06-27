public class moveZeroes {

    public static void main(String[] args) {
        int[] nums = {1,0,2,0,5,3};
        zeroes(nums);
    }

    public static void zeroes(int[] nums) {
        int swap = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {}
            else if (i == swap)
                swap++;
            else {
                nums[swap] = nums[i];
                nums[i] = 0;
                swap++;
            }
        }
    }
}
