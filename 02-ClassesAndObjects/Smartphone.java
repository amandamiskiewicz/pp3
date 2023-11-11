/*25.	Specify at least five attributes and three behaviors for the objects:
a.	Smartphone
b.	Bank account
Then, in separate files, create classes representing above objects. Define attributes and methods. 
Do not create a main method, just classes with their attributes and empty methods. 
After that, compile both classes to check whether their syntax is correct. 
Finally, display list of class attributes and methods in the VSCode (OUTLINE panel).
 */

public class Smartphone {
    String model;
    String phoneNumber;
    String color;
    int yearOfProduction;
    boolean efficiency;

    void howOld(){
        System.out.println(2023-yearOfProduction);
    }
    void displayModel(){
        System.out.println(model);
    }
    void displayEfficiency(){
        System.out.println(efficiency);
    }
}
