public class removeDuplicates {

    public int Duplicates(int[] nums) {
        int count = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;

            }
        }
        return count;
    }
}
