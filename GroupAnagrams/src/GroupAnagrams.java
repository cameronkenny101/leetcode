import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strings));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] freq = new char[26];
            for(int i = 0; i < str.length(); i++) {
               freq[str.charAt(i) - 'a']++;
            }
            String sFreq = String.valueOf(freq);
            if(map.containsKey(sFreq)) {
                map.get(sFreq).add(str);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(sFreq, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
