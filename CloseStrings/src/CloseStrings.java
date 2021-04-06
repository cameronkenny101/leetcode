import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class CloseStrings {

    public static void main(String[] args) {
        System.out.println(close("yay", "aya"));
    }

    private static boolean close(String input, String input2) {
        if(input.length() != input2.length())
            return false;
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < input.length(); i++)
            arr[input.charAt(i) - 'a']++;
        for(int i = 0; i < input2.length(); i++)
            arr2[input2.charAt(i) - 'a']++;
        for(int i = 0; i < 26; i++) {
            if(arr[i] > 0 && arr2[i] == 0 || arr[i] == 0 && arr2[i] > 0) {
                return false;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i = 0; i < 26; i++) {
            if(arr[i] != arr2[i])
                return false;
        }

        return true;
    }
}
