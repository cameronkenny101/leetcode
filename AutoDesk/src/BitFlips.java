public class BitFlips {

    public static void main(String[] args) {
        System.out.println(minBitFlip(101011101));
    }

    public static int minBitFlip(int number) {
        String binary = String.valueOf(number);
        return Math.min(bitFlip(binary, '1'), bitFlip(binary, '0'));
    }

    private static int bitFlip(String binary, char first) {
        int count = 0;
        for(int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != first) {
                count++;
            }
            first = flip(first);
        }
        return count;
    }

    private static char flip(char num) {
        if(num == '0')
            return '1';
        else
            return '0';
    }
}
