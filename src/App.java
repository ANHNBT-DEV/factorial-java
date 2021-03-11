import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial: ");
        long n = scanner.nextLong();
        long fact = factorial(n);
        System.out.print("The factorial of N is: " + fact);
    }

    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
