package homework1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWater b1 = new BottleOfWater("Bonaqua", 80, 0.5);
        BottleOfWater b2 = new BottleOfWater("Bonaqua", 120, 1);
        BottleOfWater b3 = new BottleOfWater("cola", 100, 0.5);
        BottleOfWater b4 = new BottleOfWater("cola", 150, 1);

        HotDrink c1 = new HotDrink("Nesafee", 90, 85);
        HotDrink c2 = new HotDrink("Jacobs", 100, 85);

        System.out.println(b1.getVolume());

        System.out.println(c2.getTemperature());

        WatterVendingMachine watterVendingMachine = new WatterVendingMachine(List.of(b1, b2, b3, b4));
        System.out.println(watterVendingMachine.getProduct("Bonaqua", 80, 0.5));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(List.of(c1, c2));
        System.out.println(hotDrinkVendingMachine.getProduct("Jacobs", 100, 85));

    }
}
