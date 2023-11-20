/*9.	Define a class Person for person’s record. 
The class should contain the attributes: name, weight (kg) and height (cm). Add constructors:
a.	Person(name)
b.	Person(name,weight,height)
Then add methods that represents the object's behaviors:
c.	setWeightAndHeight(weight,height)
d.	calculateBMI() – calculates Body Mass Index
e.	displayRecord() – displays full info (name, weight, height, and BMI)
The correct BMI value is 18.5 to 24.9. When displaying a person’s record, if the BMI is too low, 
display the message: "BMI too low". When the index is too high, display the message: "BMI too high". 
Write a program, create three persons and display their records.
 */

public class Person {
    String name;
    double weight;
    double height;

    public Person(String name){ //nie zapominać String xd
        this.name=name;
    }

    public Person(String name, double weight, double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }

    public void setWeightAndHeight(int weight,int height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        return weight/((height/100)*(height/100));
    }

    public String bmiCheck(){
        if (calculateBMI()>24.9) {
            return "BMI too high";
        } else if (calculateBMI()<18.5){
            return "BMI too low";

        } else {
            return "BMI is good";
        }
    }

    public String displayRecord(){
        return String.format("Name: %s\nWeight: %.02f\nHeight: %.2f\nBMI: %.2f \n%s\n", name,weight,height,calculateBMI(),bmiCheck());
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ania",70.25,160.00);
        Person person2 = new Person("Jagoda",45.50,165.00);
        Person person3 = new Person("Julia",50.00,150.00);

        System.out.println(person1.displayRecord());
        System.out.println(person2.displayRecord());
        System.out.println(person3.displayRecord());

    }
}
