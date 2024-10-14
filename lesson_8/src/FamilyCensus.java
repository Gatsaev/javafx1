public class FamilyCensus {
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
