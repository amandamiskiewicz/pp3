 /*9.	Write a program that performs the following actions for the bank account:
a.	Deposit PLN 500
b.	Display balance
c.	Deposit PLN 200
d.	Display balance
e.	Withdraw PLN 300
f.	Display balance
  */

public class BankTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(500);
        System.out.println(b.displayBalance());
        b.deposit(200);
        System.out.println(b.displayBalance());
        b.withdraw(300);
        System.out.println(b.displayBalance());
        b.withdraw(500);
        b.withdraw(600);
    }
}
