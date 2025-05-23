// Base class
class Animal {
    // Method to make sound
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass that inherits from Animal
class Dog extends Animal {
    // Override makeSound() method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        // Instantiate Animal object
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Some generic animal sound

        // Instantiate Dog object
        Dog dog = new Dog();
        dog.makeSound();            // Output: Bark
    }
}
