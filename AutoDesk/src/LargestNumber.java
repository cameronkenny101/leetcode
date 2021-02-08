public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(largestNumber(-9100));
    }

    public static int largestNumber(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        if(sb.charAt(0) == '-') {
            for(int i = 1; i < sb.length(); i++) {
                if(Integer.parseInt(String.valueOf(sb.charAt(i))) > 5) {
                    sb.insert(i, '5');
                    return Integer.parseInt(String.valueOf(sb));
                }
            }
        } else {
            for(int i = 0; i < sb.length(); i++) {
                if(Integer.parseInt(String.valueOf(sb.charAt(i))) < 5) {
                    sb.insert(i, '5');
                    return Integer.parseInt(String.valueOf(sb));
                }
            }
        }
        return 0;
    }
}
