/*24.	Variables ‘hours’ and ‘minutes’ contain the number of hours and minutes that have passed 
since midnight. Write a program that displays the given time 
(in the format hh:mm – you can use printf() method) and calculates and displays 
the number of minutes and the number of seconds that have passed since midnight. Sample result:
hours = 14
minutes = 27
time: 14:27
minutes from midnight: …
seconds from midnight: …
 */

public class Midnight {
    public static void main(String[] args) {
        int hours = 4;
        int minutes = 27;
        int minutesFromMidnight = hours*60+minutes;
        int secondsFromMidnight = minutesFromMidnight*60;

        System.out.printf("hours = %d\nminutes = %d\ntime: %02d:%d\nminutes from midnight: %d\nseconds from midnight: %d\n", hours, minutes, hours, minutes, minutesFromMidnight, secondsFromMidnight);
    }
    
}

//%02d