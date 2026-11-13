package Batch10.AssignmentNov1st.question3;

public class BankAccount {
     double balance;
     String accountHolderName;

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.accountHolderName = "Raj";
        a.balance = 50000;
        a.deposit(25347.00);
        a.displayBalance();
    }

    public  double deposit(double amount) {
        balance = balance+amount ;
        return balance;
    }

    public  double displayBalance() {
        System.out.println(accountHolderName + ", " + balance);
        return balance;
    }
}


