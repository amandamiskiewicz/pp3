public class EmailTest {
    public static void main(String[] args) {
        Email em1 = new Email("123", "test", "a@gmail.com");
        System.out.println(em1.send());
        Email em2 = new Email("abc", "test2", "b@gmail.com");
        System.out.println(em2.send());
    }
}
