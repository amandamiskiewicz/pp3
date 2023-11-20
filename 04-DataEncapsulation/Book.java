public class Book {
    private String title;
    private String author;
    private int pageCount;

    // Constructor
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Getter methods to access private attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    // Setter methods to modify private attributes (optional)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Example method to display information about the book
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }

    public static void main(String[] args) {
        // Creating a Book object
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        // Accessing and displaying information using getter methods
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Page Count: " + myBook.getPageCount());

        // Using a method to display book information
        myBook.displayBookInfo();
    }
}

