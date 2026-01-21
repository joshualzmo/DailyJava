public class BankAccount {
    private double balance = 0;
    private String[] transactions = new String[100];
    private int indexCounter = 0;

    public BankAccount(){
        
    }

    public double printBalance() {
        return balance;
    }

    public void printTransactions() {
        for(int i = 0; i < indexCounter; i++) {
            System.out.println((i + 1) + ": " + transactions[i]);
        }
    }

    public void add(double addedMoney) {
        if ((indexCounter >= 100)) {
            System.out.println("You are at the transaction limit.");
            return;
        } 
        if (addedMoney <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }
        else {
            balance += addedMoney;
            transactions[indexCounter] = "Added: " + String.valueOf(addedMoney);
            indexCounter++;
        }
    }

    public void withdrawl(double takenMoney) {
        if ((indexCounter >= 100)) {
            System.out.println("You are at the transaction limit.");
            return;
        } 
        if (takenMoney <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }
        else {
            if ((balance - takenMoney) < 0) {
                System.out.println("Insufficient funds.");
                return;
            }
            else {
            balance -= takenMoney;
            transactions[indexCounter] = "Withdrew: " + String.valueOf(takenMoney);
            indexCounter++;
            }
            
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        System.out.println(acc1.printBalance());
        acc1.add(50.25);
        System.out.println(acc1.printBalance());
        acc1.withdrawl(17.39);
        acc1.printTransactions();
    }
}
