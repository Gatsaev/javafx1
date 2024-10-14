public class Task3 {
    public static void main(String[] args) {
        System.out.println("Меньшее из 7 и 3: " + min(7, 3));
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
