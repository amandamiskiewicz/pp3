/*22.	Define a Clock class that allows you to create clocks. 
The class has two integer (int) attributes: hour and minute. 
The hour attribute can take values from 0 to 23, and the minute attribute can take values from 0 to 59. 
The constructor of this class, containing the parameters (int hour, int minute), 
allows you to initialize the clock with the given values of hours and minutes. 
The class also has an addMinute() method that moves the clock forward one minute. 
Apply data encapsulation. For the hour and minute attributes, define access and modification methods. */

public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        if (hour>=0 && hour<=23) {
            this.hour = hour;
        }
        if (minute>=0 && minute<=59) {
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void addMinute() {
        if (minute<59) {
            minute++;
        } else {
            minute=00;
            hour++;
        }
    }
        public static void main(String[] args) {
            // Tworzenie obiektu zegara
            Clock myClock = new Clock(12, 30);
    
            // Wyświetlenie początkowego stanu zegara
            System.out.println("Initial Time: " + myClock.getHour() + ":" + myClock.getMinute());
    
            // Dodanie jednej minuty do zegara
            myClock.addMinute();
    
            // Wyświetlenie zegara po dodaniu minuty
            System.out.println("Time after adding one minute: " + myClock.getHour() + ":" + myClock.getMinute());
    
            // Ustawienie nowej godziny
            myClock.setHour(14);
            myClock.setMinute(45);
    
            // Wyświetlenie zegara po zmianie godziny
            System.out.println("Time after setting new hour: " + myClock.getHour() + ":" + myClock.getMinute());
        }
    
}


// mozna jeszcze toString zrobić by było 00 itd