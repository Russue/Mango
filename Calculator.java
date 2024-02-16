public class Calculator {
    // Addition method
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
     // Subtraction method
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
      // Multiplication method
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    // Division method
    public static double division(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) num1 / num2;
    }
     // Modulus method
    public static int modulus(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 % num2;
    }
    public static void main(String[] args) {
        // Test your methods here if needed
    }
}