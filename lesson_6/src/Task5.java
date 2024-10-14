import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] strings = new String[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        // Удаляем все вхождения повторяющихся строк, заменяя их на null
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                }
            }
            strings[i] = null; // Первое вхождение также заменяем на null
        }

        System.out.println("Строки после удаления повторений:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
