public class Solution {

    public static void main(String[] args) {
        int[] arr = {37,199,60,296,257,248,115,31,273,176};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        if(arr.length == 1)
            return 1;

        boolean up = arr[1] > arr[0];
        int count = (arr[0] != arr[1]) ? 2 : 1;
        int maxCount = count;
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] > arr[i - 1] && !up) {
                count++;
                up = true;
            } else if(arr[i] < arr[i - 1] && up) {
                count++;
                up = false;
            } else {
                maxCount = Math.max(count, maxCount);
                count = (arr[i] != arr[i-1]) ? 2 : 1;
            }
        }
        return Math.max(count, maxCount);
    }
}
