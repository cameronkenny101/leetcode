import java.util.ArrayList;
import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) {
        divingBoard(26);
    }

    public static void divingBoard(int N) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 1;
        int x = N/i;

        while(x > i) {
            int[] answer = new int[2];
            x = N/i;
            answer[0] = x;
            answer[1] = i;
            if(x * i == N)
                ans.add(answer);
            i++;
        }

        for(int j = 0; j < ans.size(); j++) {
            System.out.println(Arrays.toString(ans.get(j)));
        }
    }
}
