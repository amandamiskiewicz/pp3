/*19.	Define a Point class that contains two attributes: x and y, of integer type (int), describing the coordinates of a point on the plane. 
The class constructor contains two parameters and allows you to initialize the object's attributes. 
Create an isX() method in the class that returns true if the point is on the x-axis and false otherwise. 
Create an isY() method in the class that returns true if the point is on the y-axis or false otherwise. 
Add a method in the class to represent the object as text that returns the coordinates of the point in the format "P(x,y)". Sample result:
Point(3,0)
isX() returns false
isY() returns true
toString() returns "P(3,0)"
 */


public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        if (x==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isY() {
        if (y==0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "P("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point p = new Point(3,0);
        System.out.println(p.isX()); // returns false
        System.out.println(p.isY()); // returns true
        System.out.println(p.toString()); // returns "P(3,0)"
    }

    
}
