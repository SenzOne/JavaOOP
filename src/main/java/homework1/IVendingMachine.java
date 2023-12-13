package homework1;

public interface IVendingMachine {

    Product getProductByName(String name);

    Product getProductByCost(int cost);

    public Product getProduct(String name);

    public Product getProduct(String name, double cost);

}

