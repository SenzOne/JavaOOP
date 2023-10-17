package homework1;

import java.util.List;

public class HotDrinkVendingMachine {
    List<HotDrink> hotDrinkList;

    public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
        hotDrinkList = hotDrinks;
    }

    public Product getProduct(String name) {
        for (Product p: hotDrinkList) {
            if (p.getName().equals(name)){
                return p;
            }
        } return null;
    }

    public Product getProduct(String name, double cost) {
        for (Product p: hotDrinkList) {
            if (p.getName().equals(name) && p.getCost() == cost){
                return p;
            }
        } return null;
    }

    public Product getProduct(String name, double cost, int temperature){
        for (HotDrink p: hotDrinkList) {
            if (p.getName().equals(name) && p.getCost() == cost && p.getTemperature() == temperature){
                return p;
            }
        } return null;
    }
}
