import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] strings = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        System.out.println("Содержимое массива в обратном порядке:");
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}
