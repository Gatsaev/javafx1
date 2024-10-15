public class Main {
    public static void main(String[] args) {
        // Создаем массив животных
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Кости", "Будка", "Овчарка");
        animals[1] = new Cat("Рыба", "Дом", "Черная");
        animals[2] = new Horse("Сено", "Стойло", "Быстрая");

        // Создаем ветеринара
        Veterinarian vet = new Veterinarian();

        // Отправляем животных к ветеринару
        for (Animal animal : animals) {
            vet.treatAnimal(animal);
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}
