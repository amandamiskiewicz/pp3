/**
 * BankAccount
 */
/*10.	If your account balance is less than the withdrawal amount, no withdrawal is possible. 
Include this condition in the program. When you try to withdraw, display a message. */

/*11.	In line with the bank's policy, you can withdraw no more than PLN 500 from your account at one time. Include these limitation in your program. Display a message when trying to withdraw a larger amount. */

public class BankAccount {

    private String number;
    private String owner;
    private int money;

    public String displayBalance(){
        return "Stan konta: " + money;
    }

    public void deposit(int x){
        money=money+x;
    }

    public void withdraw(int x){
        if (x>500) {
            System.out.println("Operacja niemozliwa. Kwota nie moze byc wyzsza niz 500zl");
        } else if (x<=money){
            money=money-x;
        } else {
            System.out.println("Operacja niemozliwa. Brak srodkow na koncie");
        }
    }
}
