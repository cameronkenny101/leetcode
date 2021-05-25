public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    private static boolean checkPerfectNumber(int num) {
        int sum = 0;
        int divider = 1;

        for(int i = 1; i <= num / 2; i++) {
            if(num % divider == 0)
                sum += divider;
            divider++;
        }

        return sum == num;
    }
}
