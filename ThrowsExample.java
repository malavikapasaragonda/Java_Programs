package name;

public class ThrowsExample {
    // Method declaration with throws keyword
    public static void performOperation() throws InterruptedException {
        // Simulating a method that might throw InterruptedException
        System.out.println("Performing an operation...");
        Thread.sleep(2000); // Potentially throws InterruptedException
        System.out.println("Operation completed.");
    }

    public static void main(String[] args) {
        try {
            // Calling a method that declares to throw InterruptedException
            performOperation();
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }
    }
}
