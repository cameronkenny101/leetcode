public class ShiftingLetters {

    public static void main(String[] args) {
        int[] arr = {26, 9, 17};
        System.out.println(shiftingLetters("ruu", arr));
    }

    public static String shiftingLetters(String S, int[] shifts) {
        StringBuilder ans = new StringBuilder(S);
        int cumShift = 0;

        for(int i = shifts.length - 1; i >= 0; i--) {
            cumShift += shifts[i];
            cumShift %= 26;

            if(ans.charAt(i) + cumShift > 'z') {
                int shift = cumShift - ('z' - ans.charAt(i)) - 1;
                ans.setCharAt(i, (char) ('a' + shift));
            } else {
                ans.setCharAt(i, (char) (ans.charAt(i) + cumShift));
            }
        }
        return String.valueOf(ans);
    }

}
