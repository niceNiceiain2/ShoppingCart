import com.cs3773.shopping.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product textbooks = new Product("Textbooks", Double.valueOf(50.00));
        Product shirts = new Product("Shirts", Double.valueOf(60.00));
        Product joggers = new Product("Joggers", Double.valueOf (80.00));
        Product hats = new Product("Hats", Double.valueOf (25.00));
        Product food = new Product("Food", Double.valueOf (10.00));

        ShoppingCart shop = new ShoppingCart();
        shop.addProduct(textbooks, 2);
        shop.addProduct(shirts, 2);
        shop.addProduct(joggers, 2);
        shop.addProduct(hats, 2);
        shop.addProduct(food, 2);

        System.out.println("Items in the shopping cart:");
        Map<Integer,CartItem> map = shop.getCartItems();

        for (Map.Entry<Integer, CartItem> items : map.entrySet()) {
            System.out.println("Item ID: " + items.getValue().getID());
            System.out.println("\tItem Name: " + items.getValue().getName());
            System.out.println("\tItem Price: " + items.getValue().getPrice());
            System.out.println("\tQuantity Amount: " + items.getValue().getQuantity());
        }

        System.out.println("\nTotal price: $" + shop.getTotalPrice());
    }
}