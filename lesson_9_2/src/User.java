public class User {
    String login;   // Логин пользователя
    String password; // Пароль пользователя
    Basket basket;   // Корзина пользователя

    // Конструктор для создания пользователя
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();  // У каждого пользователя своя корзина
    }

    // Метод для добавления товара в корзину
    public void addToBasket(Product product) {
        basket.addProduct(product);
    }

    // Метод для вывода информации о пользователе и его корзине
    public void displayUserInfo() {
        System.out.println("Пользователь: " + login);
        basket.displayBasketInfo();
    }
}
