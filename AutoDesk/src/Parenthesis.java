import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Parenthesis {

    public static void main(String[] args) {
        ArrayList<int[]> ans = matching("a(sfsf(()fsfs))");
        for(int i = 0; i < ans.size(); i++)
            System.out.println(Arrays.toString(ans.get(i)));
    }

   public static ArrayList<int[]> matching(String line) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '(')
                stack.push(i);
            else if(line.charAt(i) == ')'){
                int[] ans = new int[2];
                if(stack.isEmpty()) {
                    System.out.println("invalid");
                    return null;
                } else {
                    ans[0] = stack.pop();
                    ans[1] = i;
                    list.add(ans);
                }
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("invalid");
            return null;
        }
        return list;
    }

}
