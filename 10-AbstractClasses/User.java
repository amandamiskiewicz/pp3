/*11.	Create a User class with the following attributes: first name, last name, email, phone number. 
Then modify the SMS and Email classes. 
Use User class objects instead of the phone number and email attributes. */

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public User(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters for attributes

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


/*public class SMS extends Message {
    private User user;

    public SMS(String text, User user) {
        super(text);
        this.user = user;
    }

    @Override
    String send() {
        return "SMS sent to " + user.getPhoneNumber() + ": " + text + ", char count: " + charNumber();
    }
}

public class Email extends Message {
    private User user;
    private String subject;

    public Email(String text, User user, String subject) {
        super(text);
        this.user = user;
        this.subject = subject;
    }

    @Override
    String send() {
        return "Email sent to " + user.getEmail() + ": " + text + ", char count: " + charNumber() + ", subject: " + subject;
    }
}
 */