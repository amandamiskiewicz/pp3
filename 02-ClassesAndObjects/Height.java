/*21.	A variable contains your height in cm. Write a program that calculates and 
displays your height both in cm and in feet and inches. Sample result:
"I am 170cm tall, i.e. 5 feet and 7 inches"*/


public class Height {
    public static void main(String[] args){

        double heightInCm=163;
        double heightInInches=heightInCm/2.54;
        int feet=(int) (heightInInches/12);
        int inches=(int) (heightInInches%12);

        System.out.println("I am " + (int) heightInCm + "cm tall, i.e. " + feet + " feet and " + inches + " inches.");
    }
}

// (int) w print by nie było .0