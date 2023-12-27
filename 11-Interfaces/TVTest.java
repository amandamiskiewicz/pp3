/*8.	In the TV class, implement the CanOnOff interface. Define methods by which the TV can be turned on and off. 
Then write a program that:
a.	Turns on TV
b.	Displays TV status
c.	Turns off TV
d.	Displays TV status
 */

 /*10. Then write a program that:
e.	Turns on the TV
f.	Displays TV status (whether TV is on and channel number)
g.	Changes channel number to the next one.
h.	Changes channel number to 7.
i.	Changes channel number to 142.
j.	Displays TV status.
k.	Changes channel number to the previous one.
l.	Displays TV status.
m.	Turns off the TV.
n.	Displays TV status.
 */

 /*12. Then write a program that:
d.	Turns on the TV.
e.	Displays TV status (whether TV is on, channel number, volume level)
f.	Changes channel number to 15.
g.	Sets the volume level to 7.
h.	Displays TV status.
i.	Turns off the TV.
j.	Displays TV status. 
 */

public class TVTest {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.on();
        System.out.println(tv1.status());
        tv1.off();
        System.out.println(tv1.status());
        //10
        System.out.println("10");
        tv1.on();
        System.out.println(tv1.status());
        tv1.channelUp();
        System.out.println(tv1.status());
        tv1.setChannel(7);
        System.out.println(tv1.status());
        tv1.setChannel(142);
        System.out.println(tv1.status());
        tv1.channelDown();
        System.out.println(tv1.status());
        tv1.off();
        System.out.println(tv1.status());
        //12
        System.out.println("12");
        tv1.on();
        System.out.println(tv1.status());
        tv1.setChannel(15);
        for (int i = 0; i<6; i++){
            tv1.volumeUp();
        }
        System.out.println(tv1.status());
        tv1.off();
        System.out.println(tv1.status());

    }
}
