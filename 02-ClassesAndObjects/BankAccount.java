public class BankAccount {
    String cardNumber;
    String holder;
    boolean accessible;
    double cardLimit;
    double accountBalance;

    void displayCardNumber(){
        System.out.println("Card number: " + cardNumber);
    }

    void dispalAccountBalance(){
        System.out.println("Account balance: " + accountBalance);
    }

    void changeAccess(){
        accessible=!accessible;
    }

}
