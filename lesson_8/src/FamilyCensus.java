public class FamilyCensus {

    public static class Human {
        private String name;
        private boolean gender; // true = male, false = female
        private int age;
        private Human father;
        private Human mother;

        // Конструктор без отца и матери
        public Human(String name, boolean gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        // Конструктор с отцом и матерью
        public Human(String name, boolean gender, int age, Human father, Human mother) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        // Переопределение метода toString для удобного вывода информации
        @Override
        public String toString() {
            String genderStr = gender ? "мужской" : "женский";
            String fatherStr = (father != null) ? father.name : "неизвестен";
            String motherStr = (mother != null) ? mother.name : "неизвестна";
            return "Имя: " + name + ", пол: " + genderStr + ", возраст: " + age + ", отец: " + fatherStr + ", мать: " + motherStr;
        }
    }

    public static void main(String[] args) {
        // Создаем дедушек и бабушек
        Human grandFather1 = new Human("Иван", true, 78);
        Human grandMother1 = new Human("Мария", false, 75);
        Human grandFather2 = new Human("Александр", true, 80);
        Human grandMother2 = new Human("Нина", false, 77);

        // Создаем родителей
        Human father = new Human("Михаил", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Анна", false, 42, grandFather2, grandMother2);

        // Создаем троих детей
        Human child1 = new Human("Ольга", false, 18, father, mother);
        Human child2 = new Human("Алексей", true, 16, father, mother);
        Human child3 = new Human("Игорь", true, 12, father, mother);

        // Выводим всех людей на экран
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }
}
