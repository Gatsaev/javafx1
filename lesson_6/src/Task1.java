import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (или нажмите Enter для завершения): ");
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            strings.add(line.toUpperCase());
        }

        System.out.println("Строки в верхнем регистре:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
