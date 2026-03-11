import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount[] arr = new BankAccount[5];
        Scanner scnr = new Scanner(System.in);

        arr[0] = new BankAccount("Bob", 1234567);
        arr[1] = new BankAccount("Alice", 2345678);
        arr[2] = new BankAccount("John", 3456789);
        arr[3] = new BankAccount("Sarah", 4567890);
        arr[4] = new BankAccount("Mike", 5678901);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = scnr.nextInt();

            if (choice >= 1 && choice <= 3) {

                System.out.print("Enter account number: ");
                int accNum = scnr.nextInt();

                BankAccount account = null;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].getAccountName() == accNum) {
                        account = arr[i];
                        break;
                    }
                }

                if (account == null) {
                    System.out.println("Account not found.");
                    continue;
                }

                if (choice == 1) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scnr.nextDouble();
                    account.deposit(amount);
                    System.out.println("Deposit successful.");

                } else if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scnr.nextDouble();
                    account.withdrawl(amount);
                    System.out.println("Withdrawal successful.");

                } else if (choice == 3) {
                    System.out.println("Balance: $" + account.getBalance());
                }
            }
        }
        scnr.close();
        System.out.println("Program ended.");
    }
}