import java.util.Arrays;
import java.util.Scanner;

public class ChefGroups {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        scan.nextLine();
        String[] groups = new String[length];
        int i = 0;
        while (scan.hasNext()) {
            if(scan.hasNextLine()) {
                groups[i] = scan.nextLine();
                i++;
            }
        }

        for(i = 0; i < length; i++) {
            int count = 0;
            boolean prev = false;
            for(int j = 0; j < groups[i].length(); j++) {
                if(groups[i].charAt(j) == '1') {
                    if(prev)
                        continue;
                    else {
                        prev = true;
                        count++;
                    }
                } else {
                    prev = false;
                }
            }
            System.out.println(count);
            count = 0;
        }

    }
}
