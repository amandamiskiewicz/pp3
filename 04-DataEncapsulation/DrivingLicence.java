/*8.	Define the DrivingLicense class, containing the following attributes: driver's name and surname, 
address, postal code, city, driving license number, year of issue and driving license category. 
Use private access modifiers when declaring attributes. Then, create a driving license and try to 
assign values to the attributes. What message are you getting? 
After that, change the access modifiers from private to public and try to assign values once again. 
What can you observe? */

/*9.	Complete the DrivingLicense class. 
Define the display() method that displays the driving license (all data contained on the driving license). 
Try to display the data in an attractive form. What access modifier will you apply to the defined method? */

public class DrivingLicence {
    private String name;
    private String surname;
    private String postalCode;
    private String city;
    private int drivingLicenseNumber;
    private int yearOfIssue;
    private String drivingLicenseCategory;

    public String toString() {
        return "Driving license:\nname: " + name +"\nsurname: " + surname+"\nyear of issue: " + yearOfIssue;
    }

    public String getName() {
        return name;
    }

    /*13.	Modify the setName() method in the DrivingLicense.
     Regardless of the given name value, the value of the attribute should begin with a capital letter. 
     Replace the remaining letters with lowercase. 
     Then check the method in action. Tip. Use the methods available in the String class. */

    public void setName(String name) {
        String firstLetter=name.substring(0,1);
        String rest=name.substring(1);
        this.name = firstLetter.toUpperCase()+rest.toLowerCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(int drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    /*12.	In the DrivingLicense class, modify the setter method for the year of issue attribute. 
    The valid value of the attribute should be greater than or equal to 1980 
    and less than or equal to the current year. If the given value is different, do not change the attribute. */

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue>=1980 && yearOfIssue<=2023) {
            this.yearOfIssue = yearOfIssue;
        }
        
    }

    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }

    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    

}
