import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {

    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
        System.out.println(common(A));
    }

    public static List<String> common(String[] A) {
        List<String> list = new ArrayList<>();
        int[] max = new int[26];
        Arrays.fill(max, 100);
        for (String s : A) {
            int[] arr = new int[26];
            for (int j = 0; j < s.length(); j++)
                arr[s.charAt(j) - 'a']++;
            for(int j = 0; j < 26; j++)
                max[j] = Math.min(arr[j], max[j]);
        }

        for(int i = 0; i < 26; i++) {
            if(max[i] > 0) {
                for(int j = 0; j < max[i]; j++) {
                    char c = 'a';
                    c += i;
                    list.add(String.valueOf(c));
                }
            }
        }

        return list;
    }
}
