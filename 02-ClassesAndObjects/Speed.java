/*22.	The speed of vehicles on a highway in Poland must be between 40 and 140 km/h. 
Write a program that checks whether the vehicle speed saved in a variable is correct. 
Sample result:
Vehicle speed: 158
Speed is valid: False
 */

public class Speed {
    public static void main(String[] args) {

        int minSpeed = 40;
        int maxSpeed = 140;
        int givenSpeed = 20;
        
        if(givenSpeed<minSpeed || givenSpeed>maxSpeed) {
            System.out.println("Vehicle speed: " + givenSpeed);
            System.out.println("Speed is valid: "+false);
        } else {
            System.out.println("Vehicle speed: " + givenSpeed);
            System.out.println("Speed is valid: "+true);
        }
    }
}
