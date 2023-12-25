/*9.Using inheritance, define an SMS class that derives from the Message class and 
describes text messages sent from a mobile phone. 
The class contains the phone number attribute to which the text message is sent. 
The class constructor allows you to initialize a phone number. 
The class also includes accessor and mutator methods to modify value of the attribute. 
Then create and send two mobile messages. */

public class SMS extends Message {
    String phoneNumber;


    public SMS(String text, String phoneNumber) {
        super(text);
        this.phoneNumber = phoneNumber;
    }


    @Override
    String send() {
        return "treść wiadomości: "+text+", ilość znaków: "+charNumber()+", numer telefonu: "+phoneNumber;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
