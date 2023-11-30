package name;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0); // Division by zero will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed if an exception occurs
        } catch (ArithmeticException e) {
            // Catching the specific exception (ArithmeticException in this case)
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // Code that always executes whether an exception occurred or not
            System.out.println("This block always executes.");
        }
    }

    // Method that performs division and may throw an exception
    public static int divide(int num1, int num2) {
        return num1 / num2; // This may throw an ArithmeticException if num2 is zero
    }
}
