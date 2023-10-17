package homework1;

import java.util.List;

public class WatterVendingMachine implements IVendingMachine{
    List<BottleOfWater> bottleOfWaterList;

    public WatterVendingMachine(List<BottleOfWater> bottle){
        this.bottleOfWaterList = bottle;
    }

    public Product getProduct(String name) {
        for (Product p: bottleOfWaterList) {
            if (p.getName().equals(name)){
                return p;
            }
        } return null;
    }

    public Product getProduct(String name, double cost) {
        for (Product p: bottleOfWaterList) {
            if (p.getName().equals(name) && p.getCost() == cost){
                return p;
            }
        } return null;
    }

    public Product getProduct(String name, double cost, double volume){
        for (BottleOfWater p: bottleOfWaterList) {
            if (p.getName().equals(name) && p.getCost() == cost && p.getVolume() == volume){
                return p;
            }
        } return null;
    }
}
