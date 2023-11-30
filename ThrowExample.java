package name;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            // Explicitly throwing an exception using throw
            throw new ArithmeticException("Throwing an arithmetic exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
