package homework1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements IVendingMachine{

    private List<BottleOfWater> bottleOfWaterList;

    public BottleOfWaterVendingMachine(List<BottleOfWater> bottleOfWaterList) {
        this.bottleOfWaterList = bottleOfWaterList;
    }

    public BottleOfWaterVendingMachine(){
        this.bottleOfWaterList = new ArrayList<>();
    }

    @Override
    public Product getProductByName(String name) {
        for (BottleOfWater bottle :bottleOfWaterList) {
            if (bottle.getName().equals(name)) {
                return bottle;
            }
        }
        return null;
    }

    @Override
    public Product getProductByCost(int cost) {
        for (BottleOfWater bottle: bottleOfWaterList){
            if (bottle.getCost() == cost) {
                return bottle;
            }
        }
        return null;
    }

    public BottleOfWater getProduct (String name, int volume) {
        for (BottleOfWater bottle: bottleOfWaterList) {
            if (bottle.getName().equals(name) && bottle.getCost() == volume)
                return bottle;
        }
        return null;
    }

    public List<BottleOfWater> getBottleOfWaterList() {
        return bottleOfWaterList;
    }

    public void setBottleOfWaterList(List<BottleOfWater> bottleOfWaterList) {
        this.bottleOfWaterList = bottleOfWaterList;
    }

    public void addBottleOfWatter(BottleOfWater bottleOfWater){
        this.bottleOfWaterList.add(bottleOfWater);
    }
}
