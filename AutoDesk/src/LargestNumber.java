public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(largestNumber(512));
    }

    public static int largestNumber(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int negative = 0;
        if(sb.charAt(0) == '-')
            negative = 1;

        for(int i = negative; i < sb.length(); i++) {
            int num = Integer.parseInt(String.valueOf(sb.charAt(i)));
            if (negative == 1 ? num > 5 : num < 5) {
                sb.insert(i, "5");
                return Integer.parseInt(String.valueOf(sb));
            }
        }

        return Integer.parseInt(String.valueOf(sb.insert(sb.length(), "5")));
    }
}
