import java.util.List;
import java.util.stream.Collectors;

public class RecordExample {

    // Define record Person with name and age
    public record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create instances of Person
        Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Bob", 17);
        Person p3 = new Person("Charlie", 30);

        // Print individual records
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Create a list of Person
        List<Person> people = List.of(p1, p2, p3);

        // Filter people aged 18 or older using Stream API
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults (age >= 18):");
        adults.forEach(System.out::println);
    }
}
