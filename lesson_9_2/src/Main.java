public class Main {
    public static void main(String[] args) {
        // Создаем товары
        Product phone = new Product("Телефон", 699.99, 4.5);
        Product laptop = new Product("Ноутбук", 1299.99, 4.8);
        Product tv = new Product("Телевизор", 799.99, 4.6);

        // Создаем категории с товарами
        Category electronics = new Category("Электроника", new Product[]{phone, laptop, tv});

        // Показываем товары в категории
        electronics.displayCategoryInfo();

        // Создаем пользователя
        User user = new User("bil_gats", "password123");

        // Пользователь добавляет товары в корзину
        user.addToBasket(phone);
        user.addToBasket(tv);

        // Показываем информацию о пользователе и его корзине
        user.displayUserInfo();
    }
}
