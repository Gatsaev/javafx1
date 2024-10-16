public class Horse extends Animal {
    String speed; // Скорость лошади

    public Horse(String food, String location, String speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }
}
