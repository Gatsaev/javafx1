import java.util.ArrayList;

public class Basket {
    ArrayList<Product> purchasedProducts = new ArrayList<>();  // Список товаров в корзине

    // Метод для добавления товара в корзину
    public void addProduct(Product product) {
        purchasedProducts.add(product);
        System.out.println(product.name + " добавлен в корзину.");
    }

    // Метод для вывода товаров в корзине
    public void displayBasketInfo() {
        System.out.println("Товары в корзине:");
        for (Product product : purchasedProducts) {
            product.displayInfo();
        }
    }
}
