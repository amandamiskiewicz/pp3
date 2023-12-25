public class Triangle extends Shape{
    double b,h;
    double a,c;

    

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }



    public Triangle(double b, double h, double a, double c) {
        this.b = b;
        this.h = h;
        this.a = a;
        this.c = c;
    }



    @Override
    double area() {
        return (b*h)*(1.0/2.0);
    }



    @Override
    double perimeter() {
        return a+b+c;
    }

    
}
