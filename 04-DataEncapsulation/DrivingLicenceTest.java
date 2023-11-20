public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("pIOTR");
        dl.setSurname("Nowak");
        dl.setYearOfIssue(2012);
        System.out.println(dl.toString());
        dl.setYearOfIssue(1900);
        System.out.println(dl.toString());
    }
}
