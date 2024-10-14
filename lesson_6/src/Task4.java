import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] lengthArray = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите строку: ");
            stringArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            lengthArray[i] = stringArray[i].length();
        }

        System.out.println("Длины строк:");
        for (int length : lengthArray) {
            System.out.println(length);
        }
    }
}
