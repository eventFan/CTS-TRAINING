import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Before sorting: " + fruits);

        // Sort the list using a lambda expression
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));

        System.out.println("After sorting: " + fruits);
    }
}
