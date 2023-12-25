public class SMSTest {
    public static void main(String[] args) {
        SMS sms1 = new SMS("hej", "123456789");
        System.out.println(sms1.send());
        SMS sms2 = new SMS("co tam?", "123456789");
        System.out.println(sms2.send());
        
    }
}
