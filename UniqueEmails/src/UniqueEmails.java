import java.util.HashSet;

public class UniqueEmails {

    private static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for(String email : emails) {
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if(c == '.')
                    continue;
                else if(c == '+' || email.charAt(i) == '@') {
                    while(email.charAt(i) != '@')
                        i++;
                    builder.append(email.substring(i));
                    break;
                }
                builder.append(email.charAt(i));
            }
            set.add(builder.toString());
        }
        return set.size();
    }
}
