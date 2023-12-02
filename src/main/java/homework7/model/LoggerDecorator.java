package homework7.model;

public class LoggerDecorator extends CalculationModelDecorator {
    Logger logger = new Logger();

    public LoggerDecorator(Computable computable) {
        super(computable);
    }

    @Override
    public String summation(double a, double b) {
        String res = computable.summation(a, b);
        logger.logging(res);
        return res;
    }

    @Override
    public double subtraction(double a, double b) {
        return 0;
    }

    @Override
    public double division(double a, double b) {
        return 0;
    }

    @Override
    public double multiplication(double a, double b) {
        return 0;
    }
}
