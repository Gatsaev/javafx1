import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        // Ввод 8 строк с клавиатуры
        for (int i = 0; i < 8; i++) {
            strings[i] = scanner.nextLine();
        }

        // Вывод массива в обратном порядке
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}