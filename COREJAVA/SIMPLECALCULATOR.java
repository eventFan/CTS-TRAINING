// SimpleCalculator.java
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // 2. Choose operation
        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;

        // 3. Perform calculation
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation.");
                scanner.close();
                return;
        }

        // 4. Display result
        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, op, num2, result);

        scanner.close();
    }
}
