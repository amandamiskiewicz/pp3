/*6.	Based on the Vehicle class, define a derived class Car, containing the maxSpeed attribute, of type int. 
Add a constructor with two parameters, in which you initialize the values of the attributes: seats and maxSpeed. 
Add an int[] spec() method that returns the car's specification as a two-element array. 
The first element of the array contains the number of seats in the car, and the second the maximum speed.

// create Vehicle class in a separate file

public class Vehicle {

    private int seats;

    Vehicle(int s){
        seats = s;
    }
    public int getSeats(){
        return seats;
    }
  }
 */

 import java.util.Arrays;

public class Car extends Vehicle {
    int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    int[] spec(){
        int s = getSeats();
        int[] result={s,maxSpeed};
        return result;
    }

    public static void main(String[] args) {
        Car car = new Car(5,150);
        System.out.println(Arrays.toString(car.spec()));
    }
    
}
