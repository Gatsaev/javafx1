import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] strings = new String[10];
        int[] stringLengths = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
            stringLengths[i] = strings[i].length(); // Заполнение массива длинами строк
        }

        System.out.println("Длины строк:");
        for (int length : stringLengths) {
            System.out.println(length);
        }
    }
}
