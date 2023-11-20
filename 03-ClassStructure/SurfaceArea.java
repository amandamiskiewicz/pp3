/*4.	Define a class SurfaceArea that contains static methods to calculate the surface area for: 
circle, rectangle and triangle. Then, write a program that calculates and displays:
a.	area of a rectangle with sides 4 and 5
b.	area of a circle with a radius of 3
c.	area of a triangle with base 3 and height 4
 */

 /*10.	In the class SurfaceArea, add methods to calculate the surface area of the following solids: 
 cuboid, sphere, cone. In the VSCode, display a list with all defined methods (OUTLINE panel). 
 Then, complete the program to calculate and display the surface area of solids with sample dimensions. */

public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }
    static double circle(double r){
        return Math.PI*Math.pow(r, 2);
    }
    static double triangle(double a, double h){
        return (a*h)/2;
    }
    static double cuboid(double a, double b, double c){
        return 2*a*b+2*a*c+2*b*c;
    }
    static double sphere(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    static double cone(double r, double l){
        return Math.PI*r*(r+l);
    }

}
