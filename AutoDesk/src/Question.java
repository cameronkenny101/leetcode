import java.util.HashSet;
import java.util.Set;

class Question {
    public static void main(String[] args) {
        System.out.println(solution("?ab??a"));
        System.out.println(solution("bab??a"));
        System.out.println(solution("?a?"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int index = 0; index < sb.length() / 2; index++) {
            Set<Character> set = new HashSet<>();
            set.add(sb.charAt(index));
            set.add(sb.charAt(sb.length() - index - 1));
            if (set.size() == 1 && getElement(set) == '?') {
                sb.setCharAt(index, 'a');
                sb.setCharAt(sb.length() - index - 1, 'a');
            } else if (set.contains('?')) {
                set.remove('?');
                Character newChar = set.iterator().next();
                sb.setCharAt(index, newChar);
                sb.setCharAt(sb.length() - index - 1, newChar);
            } else if (set.size() == 2) {
                return "NO";
            }
        }

        return sb.toString();
    }

    public static Character getElement(Set<Character> set) {
        return set.iterator().next();
    }
}
