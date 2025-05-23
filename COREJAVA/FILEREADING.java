import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to write to the file: ");
        String input = scanner.nextLine();

        try {
            // Create a FileWriter to write to output.txt
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();  // Always close the writer

            System.out.println("Data has been written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
