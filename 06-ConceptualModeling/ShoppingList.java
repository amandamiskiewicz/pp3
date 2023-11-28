import java.util.*;

/*15.	Create a class diagram for a shopping list. 
You can use, for example, an ArrayList as the data structure for storing products. 
Then, based on the class diagram, define the class. 
Finally, create an object representing a shopping list and perform the following actions:
a.	Display the list of products (should be empty)
b.	Display information about the number of products to be purchased
c.	Add three products to your shopping list
d.	Display the list of products
e.	Display information about the number of products to be purchased
f.	Add one product to your shopping list
g.	Display the list of products
h.	Display information about the number of products to be purchased
16.	Add to the list of products the ability to enter product names from the keyboard.
 */

public class ShoppingList {
    private ArrayList<String> shoppingList = new ArrayList<String>();

    public void displayList(){
        for (String i:shoppingList){
            System.out.println(i);
        }
    }

    public void displayNumberOfProducts(){
        System.out.println(shoppingList.size());
    }

    public void addingProducts(String product){
        shoppingList.add(product);
    }

    public void addingProductsFromKeyboard(){
        final Scanner in = new Scanner(System.in);
        System.out.println("Enter a product:");
        String product = in.nextLine();
        shoppingList.add(product);
    }
    ////!!!!!!!!!!!!!!!!!
    
}
