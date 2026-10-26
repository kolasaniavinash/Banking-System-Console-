import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;
        System.out.println("Amount deposited successfully!");
        System.out.printf("Updated balance: %.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
            System.out.printf("Remaining balance: %.2f%n", balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("\n========== ACCOUNT DETAILS ==========");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.printf("Current Balance: %.2f%n", balance);
        System.out.println("=====================================");
    }
}

public class BankingSystem {
    private static final Scanner sc = new Scanner(System.in);
    private static BankAccount account;

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("       WELCOME TO BANKING SYSTEM");
        System.out.println("=====================================");

        createAccount();

        while (true) {
            System.out.println("\n============== MAIN MENU ==============");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.println("=======================================");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    if (sc.hasNextDouble()) {
                        account.deposit(sc.nextDouble());
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    if (sc.hasNextDouble()) {
                        account.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.printf("Available balance: %.2f%n",
                            account.getBalance());
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using our Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account holder name: ");
        sc.nextLine();
        String name = sc.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Enter name: ");
            name = sc.nextLine().trim();
        }

        System.out.print("Enter account number: ");
        while (!sc.hasNextLong()) {
            System.out.print("Invalid account number. Enter a whole number: ");
            sc.next();
        }
        long accountNumber = sc.nextLong();

        System.out.print("Enter initial deposit: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid amount. Enter a number: ");
            sc.next();
        }
        double initialBalance = sc.nextDouble();

        while (!Double.isFinite(initialBalance) || initialBalance < 0) {
            System.out.print("Initial deposit cannot be negative. Enter again: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Enter a valid number: ");
                sc.next();
            }
            initialBalance = sc.nextDouble();
        }

        account = new BankAccount(name, accountNumber, initialBalance);
        System.out.println("\nAccount created successfully!");
    }
}
