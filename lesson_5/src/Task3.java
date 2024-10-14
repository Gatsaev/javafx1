import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        int[] lengths = new int[10];

        // Ввод 10 строк
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        // Заполнение массива чисел длинами строк
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = strings[i].length();
        }

        // Вывод массива чисел
        for (int length : lengths) {
            System.out.println(length);
        }
    }
}