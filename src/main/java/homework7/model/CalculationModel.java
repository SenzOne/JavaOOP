package homework7.model;

public class CalculationModel implements Computable {
    @Override
    public String summation(double a, double b) {
        return String.format("%s + %s = %s", a, b, a + b);
    }

    @Override
    public String subtraction(double a, double b) {
        return String.format("%s + %s = %s", a, b, a - b);
    }

    @Override
    public String division(double a, double b) {
        if (b == 0) {
            return "Ошибка деления на ноль";
        } else {
            return String.format("%s + %s = %s", a, b,  a / b);
        }
    }

    @Override
    public String multiplication(double a, double b) {
        return String.format("%s + %s = %s", a, b, a * b);
    }
}
