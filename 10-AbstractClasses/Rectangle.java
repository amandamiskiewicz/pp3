public class Rectangle extends Shape {
    double a;
    double b;

    

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a*b;
    }

    @Override
    double perimeter() {
        return 2*a+2*b;
    }
    
    
}