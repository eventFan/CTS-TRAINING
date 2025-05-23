import java.util.Scanner;

// Step 1: Define the custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomAgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Step 2: Call method that may throw the exception
            checkAge(age);
            System.out.println("Access granted. You are eligible.");
        } catch (InvalidAgeException e) {
            // Step 3: Catch and handle the custom exception
            System.out.println("Access denied: " + e.getMessage());
        }

        scanner.close();
    }

    // Step 2: Method to check age and throw custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old.");
        }
    }
}
