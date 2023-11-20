/*11.	Create a library of methods for converting temperatures between Celsius, Kelvin, and Fahrenheit. 
You can name the methods e.g. CelsiusToKelvin(), KelvinToCelsius(), ect. 
Then create a program that calculates and displays the temperature:
a.	25 degrees Celsius in Kelvin and Fahrenheit
b.	100 degrees Fahrenheit in Kelvin and Celsius
c.	0 degrees Kelvin in Celsius and Fahrenheit
 */

public class Temp {

    static double CelsiusToKelvin(double temp){ 
        //Kelvin = Celsius + 273.15
        return temp+273.15;
    }

    static double KelvinToCelsius(double temp){
        return temp-273.15;
    }

    static double CelsiusToFahrenheit(double temp){
        //Temperature in degrees Fahrenheit (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32
        return temp*(9.0/5.0)+32;
    }

    static double FahrenheitToCelsius(double temp){
        //Temperature in degrees Celsius (°C) = (Temperature in degrees Fahrenheit (°F) - 32) * 5/9
        return (temp-32)*(5.0/9.0);
    }

    static double FahrenheitToKelvin(double temp){
        //K = (F − 32) × 5 ⁄ 9 + 273.15
        return (temp-32)*(5.0/9.0)+273.15;
    }

    static double KelvinToFahrenheit(double temp){
        //F = (K – 273.15) × 9 ⁄ 5 + 32
        return (temp-273.15)*(9.0/5.0)+32;
    }

    public static void main(String[] args) {
        System.out.println(CelsiusToKelvin(25));
        System.out.println(CelsiusToFahrenheit(25));
        System.out.println(FahrenheitToKelvin(100));
        System.out.println(FahrenheitToCelsius(100));
        System.out.println(KelvinToCelsius(0));
        System.out.println(KelvinToFahrenheit(0));
    }
}
