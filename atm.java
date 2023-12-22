import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        double balance = 10000; // Initial balance

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Welcome to ATM!");
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdraw(scanner, balance);
                    break;
                case 2:
                    deposit(scanner, balance);
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void withdraw(Scanner scanner, double balance) {
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("New balance: " + balance);
        }
    }

    private static void deposit(Scanner scanner, double balance) {
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful!");
        System.out.println("New balance: " + balance);
    }

    private static void checkBalance(double balance) {
        System.out.println("Your current balance is: " + balance);
    }
}