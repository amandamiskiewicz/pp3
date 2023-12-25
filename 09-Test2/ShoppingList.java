/*4.	Define a ShoppingList class describing the list of products to be purchased according to the structure in the Product class. 
Add the add(Product product) method to add the product to the shopping list. The toString() method returns the names 
of the products in the shopping list, in the order they were added, separated by commas, without spaces, as a single string, 
and the total() method returns the total number of products to purchase. Example:

two products have been added to the shopping list: milk, 2 and apple, 4
toString() -> "milk,apple"
total() -> 6

// create class Product in a separate file
public class Product {
  private String name;
  private int quantity;

  Product(String n, int q){
    name=n; quantity=q;
}
  public String getName(){
    return name;
}
  public int getQuantity(){
    return quantity;
}
}
 */

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> shoppingList;

    public ShoppingList() {
        shoppingList = new ArrayList<>();
    }
    
    void add(Product product){
        shoppingList.add(product);
    };


    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public String toString() {
        String result = "";
        for (Product product : shoppingList) {
            result += product.getName() + ",";
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public int total() {
        int sum = 0;
        for (Product product : shoppingList) {
            sum += product.getQuantity();
        }
        return sum;
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();

        // Adding products to the shopping list
        Product milk = new Product("milk", 2);
        Product apple = new Product("apple", 4);

        shoppingList.add(milk);
        shoppingList.add(apple);

        // Displaying the shopping list
        System.out.println("Products in the shopping list: " + shoppingList.toString());
        System.out.println("Total quantity to purchase: " + shoppingList.total());
    }
}
