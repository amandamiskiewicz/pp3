/*7.	The Cities class includes an attribute in the form of an array with city names. 
The initial value of the attribute is passed through a constructor parameter. 
The filter(char) method returns an object of the Cities class with those cities whose names start with the given character. 
The cities() method returns a string consisting of the city names contained in the object attribute. Example:

Cities(["Warszawa","Sopot","Kielce","Szczecin"]).filter('S').cities()  "SopotSzczecin"
 */

import java.util.ArrayList;

public class Cities {
    String[] cityNames;

    public Cities(String[] cityNames) {
        this.cityNames = cityNames;
    };

    public Cities filter(char ch){ 
        ArrayList<String> a1 = new ArrayList<String>();
        for (String citiesNames:cityNames){
            if(citiesNames.startsWith(String.valueOf(ch))){
                a1.add(citiesNames);
            }
        }
        String[] object =a1.toArray(new String[0]);
        Cities result = new Cities(object);
        return result;
    }

    public String cities(){
        String result="";
        for (int i = 0; i < cityNames.length; i++) {
            result+=cityNames[i];
        }
        return result;
    }

    public static void main(String[] args) {

        String[] arr1 = {"Slupsk","Warszawa","Sopot","Kielce","Szczecin","Krakow"};
        Cities c1=new Cities(arr1);
        
        System.out.println(c1.filter('S').cities());
    }

}
