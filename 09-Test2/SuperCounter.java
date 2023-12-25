/*5.	Based on the Counter class, define a derived class SuperCounter. 
Add a constructor with an int parameter to set the initial value of the counter. 
Add the addN(int n) method to increment the counter value by any n value.

// create class Counter in a separate file

public class Counter {
    private int counter;
    
    Counter(int c){
        counter=c;
    }
    public void add1(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
  }
 */


public class SuperCounter extends Counter {

    public SuperCounter(int initialValue) {
        super(initialValue);
    }

    public void addN(int n) {
        // Increment the counter by the specified value n
        for (int i = 0; i < n; i++) {
            add1(); // Use the add1 method from the Counter class
        }
    }
    public static void main(String[] args) {
        // Example usage
        SuperCounter superCounter = new SuperCounter(5);
        System.out.println("Initial counter value: " + superCounter.getCounter());

        // Increment the counter by 3
        superCounter.addN(3);
        System.out.println("Counter value after adding 3: " + superCounter.getCounter());
    }
}
