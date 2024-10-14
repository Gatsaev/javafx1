import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            lines[i] = scanner.nextLine();
        }

        String shortest = lines[0];
        String longest = lines[0];

        for (String line : lines) {
            if (line.length() < shortest.length()) {
                shortest = line;
            }
            if (line.length() > longest.length()) {
                longest = line;
            }
        }

        System.out.printf("Самая короткая строка: '%s' (длина: %d)%n", shortest, shortest.length());
        System.out.printf("Самая длинная строка: '%s' (длина: %d)%n", longest, longest.length());
    }
}
