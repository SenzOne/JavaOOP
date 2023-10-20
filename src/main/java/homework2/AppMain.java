package homework2;

public class AppMain {
    public static void main(String[] args) {
        Product product1 = new Product(1, "TV",  200., 1);
        Product product2 = new Product(2, "PC",  1000, 2);
        Market market = new Market(product1);
        Human human1 = new Human("Петя");
        Human human2 = new Human("Вася");
        market.acceptToMarket(human1);
        market.update();
//        market.acceptToMarket(human2);
//        market.update();

    }
}
