/*15.	The Product class describes food products using two attributes: the product name and whether the product is vegetarian.
 Define the class, its attributes, and getter and setter methods for all attributes. 
 Then, create a product, set attributes' values and display product information. */

public class Product {
    private String productName;
    private boolean isVegetarian;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    
    public static void main(String[] args) {
        Product p = new Product();
        p.setProductName("mleko");
        p.setVegetarian(false);
        System.out.println(p.getProductName() + " " + p.isVegetarian);
    }
}
