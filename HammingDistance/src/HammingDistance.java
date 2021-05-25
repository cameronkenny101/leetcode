public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(5, 7));
    }

    private static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
