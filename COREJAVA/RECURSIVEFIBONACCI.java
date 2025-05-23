import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;  // base case: fib(0) = 0
        } else if (n == 1) {
            return 1;  // base case: fib(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position of Fibonacci number to find: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);

        scanner.close();
    }
}
