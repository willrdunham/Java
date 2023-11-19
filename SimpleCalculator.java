import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using Simple Calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
