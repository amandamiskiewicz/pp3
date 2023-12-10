

public class Author {
    String name,surname;
    Book book;
    int age;

    void writeBook(String title,int pages, int year) {
        Book b1 = new Book(title, this.surname, pages, year);
        book = b1;
    }

    public Author(String name, String surname, Book book, int age) {
        this.name = name;
        this.surname = surname;
        this.book = book;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static void main(String[] args) {
        Author a = new Author("Marta", "Labecka", null, 23);
        a.writeBook("Flawless", 435, 2021);
        a.book.display();
    }
    
}
