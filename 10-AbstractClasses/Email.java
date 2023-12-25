/*10.	Using inheritance, define an Email class that derives from the Message class and describes messages sent using email. 
The class includes the following attributes: message subject and recipient's address. 
The class also includes accessor and mutator methods for class attributes. 
Add a constructor that allows you to create an email with the given subject and content that is sent to the given email address.
Then create and send two emails. */

public class Email extends Message {
    private String subject, address;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Email(String text, String subject, String address) {
        super(text);
        this.subject = subject;
        this.address = address;
    }

    @Override
    String send() {
        return "treść wiadomości: "+text+", ilość znaków: "+charNumber()+", temat: "+subject+", adres: "+address;
    }

    
}
