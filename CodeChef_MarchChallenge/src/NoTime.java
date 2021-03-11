import java.util.Arrays;
import java.util.Scanner;

public class NoTime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int hour = scan.nextInt();
        int time = scan.nextInt();
        scan.nextLine();
        int[] timeZones = new int[length];
        for(int i = 0; i < length; i++)
            timeZones[i] = scan.nextInt();
        System.out.println(Arrays.toString(timeZones));

    }
}
