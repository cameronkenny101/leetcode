public class AlmostPalindrome {

    public static void main(String[] args) {
        System.out.println(almostPalindrome("abxccxba"));
    }

    public static String almostPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;
        StringBuilder ans = new StringBuilder(input);
        while(i <= j) {
            if(i + 1 == j && ans.charAt(i) != ans.charAt(j)) {
                ans.insert(i, ans.charAt(j));
                break;
            }
            if(ans.charAt(i) != ans.charAt(j)) {
                ans.insert(j + 1, ans.charAt(i));
                break;
            }
            i++;
            j--;
        }
        return String.valueOf(ans);
    }
}
