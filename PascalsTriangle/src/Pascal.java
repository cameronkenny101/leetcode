import java.util.ArrayList;
import java.util.List;

public class Pascal {

    public static void main(String[] args) {
        System.out.println(getRow(6).toString());
    }

    private static List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        List<Integer> above = getRow(rowIndex - 1);
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        for(int i = 0; i < rowIndex - 1; i++) {
            curr.add(above.get(i) + above.get(i + 1));
        }
        curr.add(1);
        return curr;
    }
}
