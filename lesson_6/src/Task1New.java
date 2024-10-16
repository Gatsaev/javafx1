import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1New {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (или нажмите Enter для завершения): ");
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            if (line.length() % 2 == 0) {
                strings.add(line + line);
            } else {
                strings.add(line + line + line);
            }
        }

        System.out.println("Результаты:");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
