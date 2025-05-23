public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));          // Calls method with 2 int params
        System.out.println(calc.add(10, 20, 30));      // Calls method with 3 int params
        System.out.println(calc.add(10.5, 20.5));      // Calls method with 2 double params
    }
}
