public class longestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        int len = 0;
        int maxLen = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int j = s.length() - 1; j > i; j--) {
                if(isPalindrome(i, j, s)) {
                    len = j - i + 1;
                    if(len > maxLen) {
                        maxLen = len;
                        start = i;
                        end = j;
                    }
                    break;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    private static boolean isPalindrome(int start, int end, String s) {
        while(start <= end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else
                return false;
        }
        return true;
    }
}
