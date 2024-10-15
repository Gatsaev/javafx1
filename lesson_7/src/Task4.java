public class Task4 {
    public static void main(String[] args) {
        powerSum(2, 3);  // Пример: два раза 2^3
    }

    public static void powerSum(int number, int exponent) {
        int result1 = power(number, exponent);
        int result2 = power(number, exponent);
        int sum = result1 + result2;
        System.out.println("Сумма двух возведений в степень: " + sum);
    }

    public static int power(int number, int exponent) {
        return (int) Math.pow(number, exponent);  // Используем встроенный метод Math.pow()
    }
}
