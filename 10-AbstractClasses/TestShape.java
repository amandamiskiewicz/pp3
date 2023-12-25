public class TestShape {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2,3);
        Circle cir = new Circle(4.0);
        Triangle tri = new Triangle(2, 5 , 2, 3);

        System.out.println(rec.area());
        System.out.println(cir.area());
        System.out.println(tri.area());
        System.out.println(rec.perimeter());
        System.out.println(cir.perimeter());
        System.out.println(tri.perimeter());
        
    }
}
