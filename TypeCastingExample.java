package name;

public class TypeCastingExample {
	public static void main(String[] args) {
        // Implicit type casting (widening)
        int numInt = 100;
        long numLong = numInt; // int implicitly cast to long

        float floatNum = numLong; // long implicitly cast to float

        System.out.println("Implicit type casting:");
        System.out.println("Integer: " + numInt);
        System.out.println("Long: " + numLong);
        System.out.println("Float: " + floatNum);

        // Explicit type casting (narrowing)
        double bigDouble = 123.456;
        int smallInt = (int) bigDouble; // double explicitly cast to int

        long bigLong = 987654321;
        int smallIntFromLong = (int) bigLong; // long explicitly cast to int

        System.out.println("\nExplicit type casting:");
        System.out.println("Double to Int: " + smallInt);
        System.out.println("Long to Int: " + smallIntFromLong);
}
}