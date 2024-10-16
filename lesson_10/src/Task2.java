import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 1. Создаем список строк
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 2. Считываем 5 строк с клавиатуры
        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        // 3. Находим самую длинную строку
        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        // 4. Выводим самую длинную строку (или несколько)
        System.out.println("Самые длинные строки:");
        for (String str : strings) {
            if (str.length() == maxLength) {
                System.out.println(str);
            }
        }
    }
}
