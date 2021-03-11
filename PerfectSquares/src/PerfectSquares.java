import java.util.*;

public class PerfectSquares {

    public static void main(String[] args) {
        System.out.println(Solution(12));
    }

    public static int Solution(int n) {
        Set<Integer> list = new HashSet<>();
        int i = 1;
        while(i * i <= n) {
            list.add(i * i);
            i++;
        }

        Deque<Integer> sum = new ArrayDeque<>();
        int level = 0;
        sum.addFirst(0);
        while(!sum.isEmpty()) {
            int size = sum.size();
            for(int j = 0; j < size; j++) {
                int curr = sum.removeFirst();
                for(int val : list) {
                    int currSum = curr + val;
                    if(currSum == n)
                        return level + 1;
                    if(currSum < n)
                        sum.addLast(currSum);
                }
            }
            level++;
        }
        throw new IllegalArgumentException();
    }
}
