import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // 1. Создаем список строк
        ArrayList<String> strings = new ArrayList<>();

        // 2. Добавляем 5 строк
        strings.add("Первая строка");
        strings.add("Вторая строка");
        strings.add("Третья строка");
        strings.add("Четвертая строка");
        strings.add("Пятая строка");

        // 3. Выводим размер списка
        System.out.println("Размер списка: " + strings.size());

        // 4. Выводим содержимое списка с новой строки
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
