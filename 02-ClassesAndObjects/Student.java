public class Student {
    String name;
    int age;
    String studentId;
    boolean cardIdValidation;
    int semester;
    double averageGrade;

    void sayHello(){
        System.out.println("Hello from "+name);
    }
    void displayName(){
        System.out.println("Name is "+name);
    }
    void displayAge(){
        System.out.println("Age is"+age);
    }
    void studentData(){
        System.out.println("Student name: "+name+", semester: "+semester+", average grade: "+averageGrade);
    }
    void changeStatus(){
        cardIdValidation=!cardIdValidation;
    }
    void cardData(){
        String valid= (cardIdValidation==true)? "valid":"not valid"; //String valid = isIdCardValid ? "valid" : "not valid";
        System.out.println("Student name: "+name+", id card number: "+studentId+", card status: "+valid);
    }
}

//https://www.w3schools.com/java/java_conditions_shorthand.asp ? ternary operator