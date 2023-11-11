/*28.Define a class for describing rectangles. 
Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively. 
Display their dimensions, perimeters and surface areas. */

public class Rectangle {
    int a;
    int b;

    void displayDimensions(){
        System.out.printf("Dimensions: %dx%d\n", a, b);
    }

    void displayParimeter(){
        int parimeter=2*a+2*b;
        System.out.printf("Parimeter: %d\n", parimeter);
    }

    void displaySurfaceArea(){
        int surfaceArea=a*b;
        System.out.printf("Surface area: %d\n", surfaceArea);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.a=3;
        rectangle1.b=4;
        rectangle2.a=2;
        rectangle2.b=7;
        rectangle1.displayDimensions();
        rectangle1.displayParimeter();
        rectangle1.displaySurfaceArea();
        rectangle2.displayDimensions();
        rectangle2.displayParimeter();
        rectangle2.displaySurfaceArea();
    }

}
