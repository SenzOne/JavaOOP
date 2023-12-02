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
    public String subtraction(double a, double b) {
        String res = computable.subtraction(a, b);
        logger.logging(res);
        return res;
    }

    @Override
    public String division(double a, double b) {
        String res = computable.division(a, b);
        logger.logging(res);
        return res;

    }

    @Override
    public String multiplication(double a, double b) {
        String res = computable.multiplication(a, b);
        logger.logging(res);
        return res;
    }
}
