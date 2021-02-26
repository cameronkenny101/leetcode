import java.util.ArrayList;
import java.util.Arrays;

public class LargestNumber2 {

    public static void main(String[] args) {
        System.out.println(solution(9628));
    }

    private static int solution(int N) {
        int flag = 1;
        if(N < 0)
            flag = -1;

        N = Math.abs(N);
        String numStr = String.valueOf(N);
        String[] numarr = numStr.split("");
        ArrayList<String> result = new ArrayList<>();
        boolean inserted = false;

        for (String tmpStr : numarr) {
            int tmp = Integer.parseInt(tmpStr);
            if(flag == 1)
                inserted = tmp < 5;
            else
                inserted = tmp > 5;
            if(inserted){
                result.add(50 + tmp + "");
                break;
            }
            result.add(tmpStr);
        }

        result.addAll(Arrays.asList(numarr).subList(result.size(), numarr.length));
        if (!inserted) result.add("5");
        return flag * Integer.parseInt(String.join("", result));
    }
}
