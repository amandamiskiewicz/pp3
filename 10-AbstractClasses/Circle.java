public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(r, 2.0);
    }

    @Override
    double perimeter() {
        return 2*Math.PI*r;
    }

}
