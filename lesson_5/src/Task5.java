import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        // Ввод 20 чисел
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Копирование первой и второй половин
        System.arraycopy(numbers, 0, firstHalf, 0, 10);
        System.arraycopy(numbers, 10, secondHalf, 0, 10);

        // Вывод второго маленького массива
        for (int num : secondHalf) {
            System.out.println(num);
        }
    }
}