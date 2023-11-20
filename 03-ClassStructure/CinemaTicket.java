/*7.	Define a class CinemaTicket to describe cinema tickets. 
The ticket attributes are: cinema name, film title, row, seat, and price. 
Since the name of cinema is the same for all tickets, use a static field. 
Then, define a method to display a ticket. Use toString() method. 
Finally, try to create two tickets and display ticket details.
public class CinemaTicket {
    static String cinemaName = "...";
}
 */
/*8.	Modify the class describing cinema tickets. 
Add a constructor that creates a ticket for the specified movie, with row and seat numbers. 
Assume that in the first two rows the ticket price is PLN 10, and in the remaining rows, PLN 25. 
Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”, 
the first one is in row 2 and the second one in row 7. Print the created tickets. */

public class CinemaTicket {
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    double price;

    //constructor
    public CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle=filmTitle;
        this.row=row;
        this.seat=seat;
        this.price=(row<=2)? 10.00 : 25.00;
    }

    public String toString(){
        return String.format("Cinema name: %s\nFilm: %s\nRow: %d\nSeat: %d\nPrice: %.2f\n", cinemaName,filmTitle,row,seat,price);
    }

    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("abc", 2, 13);
        CinemaTicket ticket2 = new CinemaTicket("def", 3, 35);

        System.out.println("Ticket 1 Details:\n" + ticket1);
        System.out.println("\nTicket 2 Details:\n" + ticket2);
    }
    
}
