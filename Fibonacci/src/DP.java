public class DP {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        int[] topDown = new int[n + 1];
        return findNum(topDown, n);
    }

    public static int findNum(int[] topDown, int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        if(topDown[n] != 0)
            return topDown[n];
        return topDown[n] = findNum(topDown, n - 1) + findNum(topDown, n - 2);
    }
}
