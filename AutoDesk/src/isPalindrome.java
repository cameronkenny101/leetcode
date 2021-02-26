public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("racecar"));
    }

    public static boolean palindrome(String word) {
        int[] freq = new int[26];

        for(int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(freq[i] % 2 == 1)
               count++;
        }
        return count < 2;
    }
}
