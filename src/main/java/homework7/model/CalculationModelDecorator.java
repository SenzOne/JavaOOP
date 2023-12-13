package homework7.model;

/**
 * Абстрактный класс CalculationModelDecorator является декоратором для интерфейса Computable.
 * Реализации этого класса могут добавлять дополнительное поведение к вычислениям.
 */
public abstract class CalculationModelDecorator implements Computable{
    protected Computable computable;

    /**
     * Конструктор класса CalculationModelDecorator.
     *
     * @param computable Объект, реализующий интерфейс Computable для оборачивания дополнительной функциональностью.
     */
    public CalculationModelDecorator(Computable computable) {
        this.computable = computable;
    }
}
