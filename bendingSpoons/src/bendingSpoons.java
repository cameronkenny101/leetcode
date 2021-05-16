public class bendingSpoons {

    public static void main(String[] args) {
        int[] a = {0,1,1};
        int[] b = {1,1,1};
        System.out.println(c(a, b));
    }

    private static String c(int[] a, int[] b) {
        String small = "";
        StringBuilder big = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int i = b.length - 1; i >= 0; i--) {
            big.append(b[i]);
            ans.append(b[i]);
            if(i < a.length)
                small += a[i];
        }

        while(!small.contentEquals(big)) {
            for(int i = 0; i < small.length(); i++) {
                if(small.charAt(i) == '0')
                    ans.replace((ans.length() - small.length() + i), (ans.length() - small.length() + i) + 1, "0");
            }

            small = Integer.toBinaryString(Integer.valueOf(small, 2) + 1);
        }

        return ans.toString();
    }
}
