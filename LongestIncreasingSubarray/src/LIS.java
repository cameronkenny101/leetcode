public class LIS {

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 0, 1, 2, 4};
        System.out.println(LIS(-1, 0, arr));
    }

    private static int LIS(int prevIndex, int currIndex, int[] arr) {
        // Base Case
        if(currIndex >= arr.length)
            return 0;

        int take = 0;
        // First Choice - We Take Element
        if(prevIndex < 0 || arr[currIndex] > arr[prevIndex])
            take = 1 + LIS(currIndex, currIndex + 1, arr);
        // Second Choice - We skip to next
        int skip = LIS(prevIndex, currIndex + 1, arr);

        return Math.max(take, skip);
    }
}
