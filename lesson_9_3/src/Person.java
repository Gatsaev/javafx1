public class Person {
    String fullName;  // Полное имя
    int age;          // Возраст

    // Конструктор по умолчанию (без параметров)
    public Person() {
        this.fullName = "Школьник";  // Значение по умолчанию для имени
        this.age = 0;                   // Значение по умолчанию для возраста
    }

    // Конструктор с параметрами (для инициализации имени и возраста)
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод move() выводит сообщение о движении
    public void move() {
        System.out.println(fullName + " двигается.");
    }

    // Метод talk() выводит сообщение, что человек говорит
    public void talk() {
        System.out.println(fullName + " говорит.");
    }
}
