public class subArraySum {

    public static void main(String[] args) {
        int[] arr = new int[26];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        char letter = 'a';

        for(int i = 0; i < 26; i++) {
            int count = arr[i];
            for(int j = 0; j < count; j++)
                System.out.print(letter);
            letter += 1;
        }
    }
}
