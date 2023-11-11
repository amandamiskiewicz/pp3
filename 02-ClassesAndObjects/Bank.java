/*23.	A bank buys and sells Euro. Write a program that, based on the Euro buying 
and selling rates saved in variables, calculates the difference between the buying 
and selling rates (spread). Display result with 4 decimal places (you can use printf() method). 
Sample result:
Bank buys EUR: 4.5940
Bank sells EUR: 4.6250
Spread: 0.0310
 */

public class Bank {
    public static void main(String[] args) {
        double buy = 4.5940;
        double sell = 4.6250;
        double spread = sell-buy;
        System.out.printf("Bank buys EUR: %.4f\nBank sells EUR: %.4f\nSpread: %.4f\n", buy, sell, spread);
    }
}

//%.4f