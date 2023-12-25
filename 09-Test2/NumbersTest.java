public class NumbersTest {
    public static void main(String[] args) {
        Numbers num1 = new Numbers(3, 4, 2, 1, 6);
        System.out.println(num1.different());

        Numbers num2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(num2.different());

        Numbers num3 = new Numbers(1,2,3,4,5);
        System.out.println(num3.different());

        Numbers num4 = new Numbers(1,2,3,4,4);
        System.out.println(num4.different());
    }
}
