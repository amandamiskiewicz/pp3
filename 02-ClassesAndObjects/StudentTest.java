public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        //zad18
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="Ania";
        s1.age=20;
        s1.cardIdValidation=true;
        s1.semester=3;
        s1.averageGrade=4.5;
        s1.studentId="12345";
        s2.name="Olga";
        s2.age=20;
        s2.cardIdValidation=false;
        s2.semester=5;
        s2.averageGrade=3.5;
        s2.studentId="54321";

        s1.sayHello();
        s2.displayAge();
        s1.studentData();
        s2.cardData();
        s2.changeStatus();
        s2.cardData();

    }
}
