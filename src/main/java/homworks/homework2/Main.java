package homworks.homework2;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 3),
                new Cat("Mursik", 6),
                new Cat("Ap", 4),
                new Cat("Yasa", 4),
                new Cat("Matroskin", 4),
                new Cat("Ap", 4)
        };

        Plate plate = new Plate(100);
        for (Cat cat: cats) {
            if (plate.getFood() - cat.getAppetite() >= 0 ){
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            }
        }
        plate.info();
    }
}
