package homework7.model;

public abstract class CalculationModelDecorator implements Computable{
    protected Computable computable;

    public CalculationModelDecorator(Computable computable) {
        this.computable = computable;
    }
}
