import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your bank!");
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        // Create a bank account for the customer
        BankAccount account = new BankAccount(customerName);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
                    } else {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our banking app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}

class BankAccount {
    private String customerName;
    private double balance;

    public BankAccount(String customerName) {
        this.customerName = customerName;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
