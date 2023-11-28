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

public class ShoppingListTest {
    public static void main(String[] args) {
        ShoppingList l = new ShoppingList();
        l.displayList();
        l.displayNumberOfProducts();
        l.addingProducts("Mleko");
        l.addingProducts("Jajka");
        l.addingProducts("Chleb");
        l.displayList();
        l.displayNumberOfProducts();
        l.addingProducts("Jabłka");
        l.displayList();
        l.displayNumberOfProducts();
        l.addingProductsFromKeyboard();
        l.displayList();
        l.displayNumberOfProducts();
    }
}
