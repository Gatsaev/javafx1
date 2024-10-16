import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 1. Создаем список строк
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 2. Считываем 5 строк с клавиатуры
        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        // 3. Находим самую короткую строку
        int minLength = strings.get(0).length();  // Инициализируем минимальную длину первой строкой
        for (String str : strings) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        // 4. Выводим самую короткую строку (или несколько)
        System.out.println("Самые короткие строки:");
        for (String str : strings) {
            if (str.length() == minLength) {
                System.out.println(str);
            }
        }
    }
}
