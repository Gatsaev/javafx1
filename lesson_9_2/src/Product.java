public class Product {
    String name;   // Имя товара
    double price;  // Цена товара
    double rating; // Рейтинг товара

    // Конструктор для создания товара
    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    // Метод для вывода информации о товаре
    public void displayInfo() {
        System.out.println("Товар: " + name + ", Цена: " + price + ", Рейтинг: " + rating);
    }
}
