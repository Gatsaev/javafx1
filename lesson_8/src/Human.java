public class Human {
    private String name;

    /**
     * Пол true означает, что человек мужского пола, false — женского.
     */
    private boolean isMale;
    private int age;
    private Human father;
    private Human mother;

    // Конструктор без отца и матери
    public Human(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    // Конструктор с отцом и матерью
    public Human(String name, boolean isMale, int age, Human father, Human mother) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    // Переопределение метода toString для удобного вывода информации
    @Override
    public String toString() {
        String genderStr = isMale ? "мужской" : "женский";
        String fatherStr = (father != null) ? father.name : "неизвестен";
        String motherStr = (mother != null) ? mother.name : "неизвестна";

        // Используем String.format для форматирования строки
        return String.format("Имя: %s, пол: %s, возраст: %d, отец: %s, мать: %s",
                name, genderStr, age, fatherStr, motherStr);
    }
}
