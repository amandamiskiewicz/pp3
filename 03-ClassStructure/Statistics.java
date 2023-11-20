/*12.	Create a library of methods for the calculation of basic statistics:
a.	Number of items within the specified range <x,y>
b.	Sum of numbers in the given range  <x,y>
c.	Arithmetic mean of the numbers in the given range  <x,y>
Then create a program that calculates and displays the basic statistics for integers in the range <5,10>
 */
public class Statistics {
    static int numberOfItems(int x, int y){
        int number=0;
        for (int i=x; i<=y; i++){
            number++;
        }
        return number;
    }

    static int sumOfNumbers(int x, int y){
        int sum=0;
        for (int i=x;i<=y;i++){
            sum=sum+i;
        }
        return sum;
    }

    static double arithmeticMean(int x, int y){
        return (double) sumOfNumbers(x, y)/numberOfItems(x, y); //syntax!!
    }
    
    public static void main(String[] args) {
        System.out.println(numberOfItems(1,4));
        System.out.println(sumOfNumbers(1,4));
        System.out.println(arithmeticMean(1,4));
    }
}