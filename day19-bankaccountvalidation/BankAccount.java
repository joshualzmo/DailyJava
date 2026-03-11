class BankAccount {
    private String name;
    private int accountNum;
    private double balance = 0;

    public BankAccount(String name, int accountNum) throws IllegalArgumentException {
        if (name.isBlank()) throw new IllegalArgumentException("Must enter a valid name.");
        this.name = name;
        int length = String.valueOf(accountNum).length();
        if (length != 7) throw new IllegalArgumentException("Account number must be seven digits long.");
        this.accountNum = accountNum;
    }
    public String getName() {
        return name;
    }
    public int getAccountName() {
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws ArithmeticException {
        if (amount < 0) throw new ArithmeticException("Deposit error.");
        balance += amount;
    }
    public void withdrawl(double amount) throws ArithmeticException {
        if (balance - amount < 0 || amount < 0) throw new ArithmeticException("Withdrawl error.");
        balance -= amount;
    }
}
