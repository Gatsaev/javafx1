public class Category {
    String name;      // Имя категории
    Product[] products; // Массив товаров

    // Конструктор для создания категории с товарами
    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    // Метод для вывода информации о категории и товарах
    public void displayCategoryInfo() {
        System.out.println("Категория: " + name);
        for (Product product : products) {
            product.displayInfo();
        }
    }
}
