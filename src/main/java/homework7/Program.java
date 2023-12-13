package homework7;

import homework7.controller.Controller;
import homework7.model.CalculationModel;
import homework7.model.Computable;
import homework7.model.DateTimeDecorator;
import homework7.model.LoggerDecorator;
import homework7.view.View;

public class Program {

    public static void main(String[] args) {
        Computable computable = new LoggerDecorator(new DateTimeDecorator(new CalculationModel()));
        View view = new View();
        Controller controller = new Controller(computable, view);
        controller.getData();
        controller.calculate();
    }
}
