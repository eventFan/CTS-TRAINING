// Define a class named 'Car'
class Car {
    // Fields (attributes)
    String make;
    String model;
    int year;

    // Constructor to initialize a Car object
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Call method on the object
        myCar.displayInfo();
    }
}
