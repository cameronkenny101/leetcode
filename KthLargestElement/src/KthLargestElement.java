import java.util.Random;

public class KthLargestElement {

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1,2};
        int k = 2;
        KthLargestElement largestElement = new KthLargestElement();
        System.out.println(largestElement.kthLargest(arr, k));
    }

    public int kthLargest(int[] nums, int k) {
        int index = nums.length - k;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int pivotIndex = partition(nums, left, right);
            if(pivotIndex == index)
                break;
            else if(pivotIndex < index)
                left = pivotIndex + 1;
            else
                right = pivotIndex - 1;
        }
        return nums[index];
    }

    private int partition(int[] nums, int left, int right) {
        Random rand = new Random();
        int pivot = left + rand.nextInt(right - left);
        swap(nums, pivot, right);
        int i = left, j = i;
        while(j < right) {
            if(nums[j] < nums[right]) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        swap(nums, i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
