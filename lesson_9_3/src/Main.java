public class Main {
    public static void main(String[] args) {
        // Создаем объект с использованием конструктора по умолчанию
        Person person1 = new Person();
        person1.move();  // Вызываем метод move()
        person1.talk();  // Вызываем метод talk()

        System.out.println(); // Пустая строка для разделения вывода

        // Создаем объект с использованием конструктора с параметрами
        Person person2 = new Person("Иван Иванов", 25);
        person2.move();  // Вызываем метод move()
        person2.talk();  // Вызываем метод talk()
    }
}
