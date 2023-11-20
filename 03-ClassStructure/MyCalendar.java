/*6.	Define a class MyCalendar with three static integer fields: year, month and day. Then, create:
a.	Method myDate() that returns the date as a string, in the format yyyy-mm-dd
b.	Method days() that returns the number of days passed from the beginning of year.
c.	Method monthName() the returns a string with the month name
 */

 public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static final int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    static final String[] months = {"styczeń", "luty", "marzec", "kwiecien", "maj", "czerwiec", "lipiec", "sierpien", "wrzesien", "pazdziernik", "listopad", "grudzien"};
    static int day = 9;

    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    static String myDate(){
        return String.format("%d-%02d-%02d",year,month,day);
    }

    /*
     * Returns the number of days
     * from the beginning of year
     */
    static int days(){
        int sum = 0;
        for (int i=0;i<month;i++) {
            sum=sum+days[i];
        }
    return sum+day;
    }
    /*
     * Returns month name
     */
    static String monthName(){
        return months[month-1];
    }
    public static void main(String[] args) {
        System.out.println(myDate());
        System.out.println(days());
        System.out.println(monthName());
    }
}
