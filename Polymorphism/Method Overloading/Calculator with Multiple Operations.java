class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2)); // Output: 3
        System.out.println(calculator.add(1.5, 2.5)); // Output: 4.0
        System.out.println(calculator.subtract(5, 3)); // Output: 2
        System.out.println(calculator.subtract(5.5, 3.5)); // Output: 2.0
        System.out.println(calculator.multiply(4, 5)); // Output: 20
        System.out.println(calculator.multiply(4.5, 5.5)); // Output: 24.75
        System.out.println(calculator.divide(10, 2)); // Output: 5
        System.out.println(calculator.divide(10.5, 2.5)); // Output: 4.2
    }
}
