public class XOR {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(XORarray(arr));
    }


    public static long XORarray(int[] arr) {
        long result = 0;
        for(int i = 0; i < arr.length; i++) {
            int x = (i + 1) * (arr.length - i);
            if(x % 2 != 0)
                result = result ^ arr[i];
        }

        return result;
    }
}
