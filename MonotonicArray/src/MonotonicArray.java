public class MonotonicArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        System.out.println(monotonicArray(arr));
    }

    private static boolean monotonicArray(int[] A) {
        int i = 0;
        boolean up = false;

        while(i < A.length - 1) {
            if(A[i] != A[i + 1]) {
                up = A[i] < A[i + 1];
                break;
            }
            i++;
        }

        while (i < A.length - 1) {
            if(up && A[i] > A[i + 1])
                return false;
            else if(!up && A[i] < A[i + 1])
                return false;
            i++;
        }

        return true;
    }
}
