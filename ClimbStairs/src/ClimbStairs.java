public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    private static int climbStairs(int n) {
        int[] knownPaths = new int[n + 1];
        return countPath(knownPaths, n);
    }

    private static int countPath(int[] knownPaths, int n) {
        if(n == 0)
            return 1;
        else if(n < 0)
            return 0;

        if(knownPaths[n] != 0)
            return knownPaths[n];
        int left = countPath(knownPaths, n-1);
        int right = countPath(knownPaths, n-2);
        return knownPaths[n] = left + right;
    }
}
