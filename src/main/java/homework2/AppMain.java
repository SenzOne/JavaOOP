package homework2;

public class AppMain {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Петя");
        market.acceptToMarket(human1);
        market.update();
    }
}
