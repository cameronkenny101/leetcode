import java.util.Scanner;

public class rotating_digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int X = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        int rotatedNumbers = rotatedDigits(X);
        System.out.println("Number of rotated numbers in " + X + " is " + rotatedNumbers);
    }

    public static int rotatedDigits(int N) {
        int[] valid = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};
        int result = 0;
        for(int i = 2; i <= N; i++) {
            if(validNumber(valid, i))
                result++;
            else
                continue;
        }
        return result;
    }

    private static boolean validNumber(int[] valid, int num) {
        boolean rotatedNumber = false;
        while(num > 0) {
            int digit = num % 10;
            if(valid[digit] == -1)
                return false;
            else if(valid[digit] == 1)
                rotatedNumber = true;
            num/=10;
        }
        return rotatedNumber;
    }
}
