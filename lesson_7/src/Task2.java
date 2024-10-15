public class Task2 {
    public static void main(String[] args) {
        System.out.println("Число 7 больше 5: " + isGreaterThanFive(7));
        System.out.println("Число 3 больше 5: " + isGreaterThanFive(3));
    }

    public static boolean isGreaterThanFive(int number) {
        return number > 5;
    }
}
