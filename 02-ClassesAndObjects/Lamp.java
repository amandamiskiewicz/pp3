/*27.Define a class for describing lamps. Then, define the following object attributes and behaviors:
a.attributes: whether a lamp is on
b.behaviors: (1) switch on the lamp, 
(2) switch off the lamp, 
(3) display information whether the lamp is on or off (use ?: operator)
After that, create two lamps, switch on the first one and switch off the second one. 
Display information whether the lamps are on or off.
 */

public class Lamp {
    boolean lampStatus;

    void switchOn(){
        lampStatus=true;
    }
    void switchOff(){
        lampStatus=false;
    }
    void displayLampInfo(){
        String result = (lampStatus) ? "Lamp is on." : "Lamp is off.";
        System.out.println(result);
    }
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();
        lamp1.switchOn();
        lamp2.switchOff();
        lamp1.displayLampInfo();
        lamp2.displayLampInfo();
    }
}

//ten short hand if else