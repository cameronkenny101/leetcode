import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbc"));
    }

    static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        int maxLength = 0;
        int length = 0;

        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                i = map.remove(s.charAt(i));
                length = 0;
                map.clear();
            } else {
                map.put(s.charAt(i), i);
                length++;
                if(length > maxLength)
                    maxLength = length;
            }
        }
        return maxLength;
    }
}
