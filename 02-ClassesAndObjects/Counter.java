/*29.	Design a simple counter. 
The initial value of the counter is 0. 
The counter can be increased or decreased by one, and increased and decreased by 10. 
It is possible to reset the counter to its initial value. 
Then, define a class for counters with five methods. 
Based on the class definition, create two counters. 
Finally, using the defined methods, set the value for the first counter to 23 and for the second one to -47. 
Display results. */
public class Counter {
    int currentCount=0;

    void incByOne(){
        currentCount++;
    }

    void decByOne(){
        currentCount--;
    }

    void incByTen(){
        currentCount+=10;
    }

    void decByTen(){
        currentCount-=10;
    }

    void resetCounter(){
        currentCount=0;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter(); //23
        Counter counter2 = new Counter(); //-47
        counter1.incByTen();
        counter1.incByTen();
        counter1.incByOne();
        counter1.incByOne();
        counter1.incByOne();
        System.out.println("Counter 1: " + counter1.currentCount);
        counter2.decByTen();
        counter2.decByTen();
        counter2.decByTen();
        counter2.decByTen();
        counter2.decByOne();
        counter2.decByOne();
        counter2.decByOne();
        counter2.decByOne();
        counter2.decByOne();
        counter2.decByOne();
        counter2.decByOne();
        System.out.println("Counter 2: " + counter2.currentCount);

    }
}
