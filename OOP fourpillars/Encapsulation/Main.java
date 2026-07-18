//Encapsulation means hiding data and allowing access only through controlled methods.
class BankAccount {

    private double balance = 1000;   // Hidden data

    // Public method to access data
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(500);

        System.out.println(account.getBalance());
    }
}