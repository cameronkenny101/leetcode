import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class KthFrequent {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3,3,5};
        KthFrequent frequent = new KthFrequent();
        System.out.println(Arrays.toString(frequent.topKFrequent(arr, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        int[] unique = new int[map.size()];

        int i = 0;
        for(int num : map.keySet()) {
            unique[i] = num;
            i++;
        }

        int index = unique.length - k;
        int left = 0;
        int right = unique.length - 1;
        while (left < right) {
            int pivotIndex = partition(unique, map, left, right);
            if(pivotIndex == index)
                break;
            else if(pivotIndex < index)
                left = pivotIndex + 1;
            else
                right = pivotIndex - 1;
        }
        return Arrays.copyOfRange(unique, index, unique.length);
    }

    private int partition(int[] unique, HashMap<Integer, Integer> map, int left, int right) {
        Random rand = new Random();
        int pivot = left + rand.nextInt(right - left);
        swap(unique, pivot, right);
        int i = left, j = i;
        while(j < right) {
            if(map.get(unique[j]) < map.get(unique[right])) {
                swap(unique, i, j);
                i++;
            }
            j++;
        }
        swap(unique, i, right);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
