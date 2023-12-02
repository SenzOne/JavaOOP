package homework7.model;

/**
 * Класс CalculationModel реализует интерфейс Computable для выполнения вычислений.
 */
public class CalculationModel implements Computable {

    /**
     * Выполняет операцию сложения двух чисел.
     *
     * @param a Первое число
     * @param b Второе число
     * @return Результат сложения в виде строки
     */
    @Override
    public String summation(double a, double b) {
        return String.format("%s + %s = %s", a, b, a + b);
    }

    /**
     * Выполняет операцию вычитания одного числа из другого.
     *
     * @param a Уменьшаемое число
     * @param b Вычитаемое число
     * @return Результат вычитания в виде строки
     */
    @Override
    public String subtraction(double a, double b) {
        return String.format("%s - %s = %s", a, b, a - b);
    }

    /**
     * Выполняет операцию деления одного числа на другое.
     *
     * @param a Делимое число
     * @param b Делитель
     * @return Результат деления в виде строки, либо сообщение об ошибке при делении на ноль
     */
    @Override
    public String division(double a, double b) {
        if (b == 0) {
            return "Ошибка деления на ноль";
        } else {
            return String.format("%s / %s = %s", a, b, a / b);
        }
    }

    /**
     * Выполняет операцию умножения двух чисел.
     *
     * @param a Первый множитель
     * @param b Второй множитель
     * @return Результат умножения в виде строки
     */
    @Override
    public String multiplication(double a, double b) {
        return String.format("%s * %s = %s", a, b, a * b);
    }
}
