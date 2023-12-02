package homework7.model;

public class CalculationModel implements Computable {
    @Override
    public String summation(double a, double b) {
        return String.format("%s + %s = %s", a, b, a + b);
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }
}
