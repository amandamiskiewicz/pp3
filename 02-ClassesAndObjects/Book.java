/*26.	Define a class for describing books. Then, in the class, define fields and methods 
that represent the attributes and behaviors of book objects. Finally, create two books, 
assign them attribute values, and call defined methods. */

public class Book {
    String title;
    String author;
    int publicationYear;
    boolean bestseller;

    void changeBestsellerStatus(){
        bestseller=!bestseller;
    }

    void displayBookInformation(){
        System.out.printf("Title: %s\nAuthor: %s\nYear of publication: %d\nBestseller: %b\n",title,author,publicationYear,bestseller);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title="abc";
        book1.author="Jan Kowalski";
        book1.publicationYear=2020;
        book1.bestseller=false;
        Book book2 = new Book();
        book2.title="def";
        book2.author="Piotr Nowak";
        book2.publicationYear=1999;
        book2.bestseller=true;
        book1.displayBookInformation();
        book1.changeBestsellerStatus();
        book1.displayBookInformation();
        book2.displayBookInformation();
    }
}
