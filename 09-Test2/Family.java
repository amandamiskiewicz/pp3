/*1.	Define a Family class that describes a group of people that make up a family. 
The constructor of the class has one parameter of the Person[] type, which allows you to pass people to the family at the time of its creation. 
Add an adults() method that returns the number of adults in the family (18 or older).

public class Person {
  private String name;
  private int age;

  Person(String n, int a){
    name=n; age=a;
}
  public int getAge(){
    return age;
}
 */

 public class Family {
    private Person[] members;


public Family(Person[] members) {
        this.members = members;
    }

    //for (type variableName : arrayName) {
//// code block to be executed
//}
    public int adults() {
        int adultCount = 0;

        for (Person person : members) {  
            if (person.getAge() >= 18) {
                adultCount++;
            }
        }

        return adultCount;
    }

    public static void main(String[] args) {
        // Przykładowe użycie klasy Family

        // Tworzenie obiektów klasy Person
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Anna", 30);
        Person person3 = new Person("Mike", 16);

        // Tworzenie tablicy osób
        Person[] familyMembers = {person1, person2, person3};

        // Tworzenie obiektu klasy Family
        Family myFamily = new Family(familyMembers);

        // Wywołanie metody adults() i wyświetlenie wyniku
        System.out.println("Number of adults in the family: " + myFamily.adults());
    }
}
