import java.util.Scanner;

public class maxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        int answer = maximum(num);
        System.out.println("The largest number by changing at most one number is " + answer);
    }

    public static int maximum(int num) {
        int ans = 0;
        boolean flag = false;
        int n = num;
        num = 0;

        while(n != 0){
            num = num * 10 + n % 10;
            n /= 10;
        }

        while(num != 0) {
            int digit = num % 10;
            if(!flag && digit == 6) {
                ans = ans * 10 + 9;
                flag = true;
            }

            else
                ans = ans * 10 + digit;

            num /= 10;
        }
        return ans;
    }
}
