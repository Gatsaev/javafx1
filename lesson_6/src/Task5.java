import java.util.HashSet;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] strings = new String[6];
        HashSet<String> uniqueStrings = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Ввод строк
        for (int i = 0; i < 6; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        // Удаляем все вхождения повторяющихся строк, заменяя их на null
        for (int i = 0; i < strings.length; i++) {
            if (uniqueStrings.contains(strings[i])) {
                strings[i] = null; // Если строка уже есть в HashSet, заменяем на null
            } else {
                uniqueStrings.add(strings[i]); // Добавляем первое вхождение в HashSet
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i] != null && strings[i].equals(strings[j])) {
                        strings[j] = null; // Удаляем последующие повторения
                    }
                }
            }
        }

        // Вывод строк после удаления повторений
        System.out.println("Строки после удаления повторений:");
        for (String string : strings) {
            if (string != null) {
                System.out.println(string);
            }
        }
    }
}
