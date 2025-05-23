// TypeCastingExample.java

public class TypeCastingExample {

    public static void main(String[] args) {
        
        // Implicit Casting (Widening) - smaller to larger data type
        int intVal = 100;
        long longVal = intVal;           // int to long
        float floatVal = longVal;        // long to float

        // Explicit Casting (Narrowing) - larger to smaller data type
        double doubleVal = 123.456;
        int castedInt = (int) doubleVal; // double to int (fraction lost)
        byte castedByte = (byte) intVal; // int to byte (may overflow if >127)

        // Display values
        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);

        System.out.println("\nExplicit Casting:");
        System.out.println("double to int: " + castedInt);
        System.out.println("int to byte: " + castedByte);
    }
}
