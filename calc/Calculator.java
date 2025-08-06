// Save this file as Calculator.java inside folder "calc"

package calc;

public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    // Main method to execute and test calculator operations
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double a = 10;
        double b = 5;

        System.out.println("Add: " + calc.add(a, b));
        System.out.println("Subtract: " + calc.subtract(a, b));
        System.out.println("Multiply: " + calc.multiply(a, b));
        System.out.println("Divide: " + calc.divide(a, b));
    }
}
