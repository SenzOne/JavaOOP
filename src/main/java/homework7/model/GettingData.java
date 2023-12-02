package homework7.model;

public class GettingData {
    private String inputData;

    public GettingData(String inputData) {
        this.inputData = inputData;
    }

    // TODO: переделать в hashMap
    public boolean checkData() {
        String[] res = inputData.split(" ");
        if (res.length != 3) {
            System.out.println("Неверный формат воода");
            return false;
        } else return true;
    }

    public double getDoubleFirstInput() {
        return Double.parseDouble(inputData.split(" ")[0]);
    }
    public double getDoubleLastInput() {
        return Double.parseDouble(inputData.split(" ")[2]);
    }

    public char getOperator() {
        return (inputData.split(" ")[1].charAt(0));
    }
}
