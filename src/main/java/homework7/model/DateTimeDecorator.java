package homework7.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс DateTimeDecorator является декоратором, добавляющим дату и время к результатам вычислений.
 */
public class DateTimeDecorator extends CalculationModelDecorator{
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);

    /**
     * Конструктор класса DateTimeDecorator.
     *
     * @param computable Объект, реализующий интерфейс Computable, к которому добавляется функциональность декоратора.
     */
    public DateTimeDecorator(Computable computable) {
        super(computable);
    }

    @Override
    public String summation(double a, double b) {
       return formattedDateTime + " " + computable.summation(a, b);
    }

    @Override
    public String subtraction(double a, double b) {
        return formattedDateTime + " " + computable.subtraction(a, b);
    }

    @Override
    public String division(double a, double b) {
        return formattedDateTime + " " + computable.division(a, b);
    }

    @Override
    public String multiplication(double a, double b) {
        return formattedDateTime + " " + computable.multiplication(a, b);
    }
}
