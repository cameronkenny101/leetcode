public class LIS {

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 0, 1, 2, 4};
        System.out.println(dpLIS(arr));
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

    private static int dpLIS(int[] arr) {
        int[] lis = new int[arr.length];
        lis[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            lis[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i])
                    lis[i] = Math.max(lis[i], lis[j] + 1);
            }
        }
        int ans = 1;
        for(int i = 0; i < arr.length; i++)
            ans = Math.max(ans, lis[i]);

        return ans;
    }
}
