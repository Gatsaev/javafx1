import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Сканнер создан в main и передается в методы
        int num1 = getInt(scanner);
        int num2 = getInt(scanner);
        char operation = getOperation(scanner);
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    // Метод для ввода числа
    public static int getInt(Scanner scanner) {  // Передаем сканнер в метод
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    // Метод для ввода операции
    public static char getOperation(Scanner scanner) {  // Передаем сканнер в метод
        System.out.print("Введите операцию (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    // Метод для выполнения арифметической операции
    public static int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return 0;
                }
            default:
                System.out.println("Ошибка: неверная операция!");
                return 0;
        }
    }
}
