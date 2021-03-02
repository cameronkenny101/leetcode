public class Pow {

    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }

    public static double pow(double x, int n) {
        boolean negative = false;
        if(n < 0)
            negative = true;
        if(n == 0)
            return 1;
        n = Math.abs(n);
        double num = powRecursive(x, n);

        if(negative)
            return 1/num;
        else
            return num;
    }

    public static double powRecursive(double x, int n) {
        if(n == 0)
            return 1;
        double product = powRecursive(x, n/2);
        if(n % 2 == 0)
            return product * product;
        else
            return product * product * x;
    }
}
