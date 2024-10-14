import java.util.HashSet;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] strings = new String[6];
        HashSet<String> uniqueStrings = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (uniqueStrings.contains(strings[i])) {
                strings[i] = null; // заменяем на null, если строка повторяется
            } else {
                uniqueStrings.add(strings[i]);
            }
        }

        System.out.println("Строки после удаления повторений:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
