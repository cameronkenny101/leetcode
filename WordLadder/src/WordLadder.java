import java.util.*;

public class WordLadder {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        System.out.println(ladderLength("hit", "cog", list));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord))
            return 0;

        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        int level = 1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int x = 0; x < size; x++) {
                String curr = queue.remove();
                if(curr.equals(endWord))
                    return level;
                for (int i = 0; i < curr.length(); i++) {
                    char[] temp = curr.toCharArray();
                    for (char j = 'a'; j <= 'z'; j++) {
                        temp[i] = j;
                        String tempWord = String.valueOf(temp);
                        if (set.contains(tempWord)) {
                            queue.add(tempWord);
                            set.remove(tempWord);
                        }
                    }
                }
            }
            level++;
        }

        return 0;
    }
}
