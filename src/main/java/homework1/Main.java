package homework1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWater b1 = new BottleOfWater("Bonaqua", 80, 0.5);
        BottleOfWater b2 = new BottleOfWater("Bonaqua", 120, 1);
        BottleOfWater b3 = new BottleOfWater("cola", 100, 0.5);
        BottleOfWater b4 = new BottleOfWater("cola", 150, 1);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(List.of(b1, b2, b3, b4));

        System.out.println(vendingMachine.getProductByName("cola"));
    }
}
