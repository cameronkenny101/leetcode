public class BadVersion {

    boolean isBadVersion(int n) {
        return true;
    }

    private int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while(low < high) {
            int mid = (high + low) / 2;

            if(isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
