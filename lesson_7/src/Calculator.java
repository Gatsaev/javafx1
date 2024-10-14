import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);
    }

    // Метод для ввода числа
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scanner.nextInt();
    }

    // Метод для ввода операции
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
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
