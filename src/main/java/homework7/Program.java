package homework7;

import homework7.controller.Controller;
import homework7.model.CalculationModel;
import homework7.model.Computable;
import homework7.model.LoggerDecorator;
import homework7.view.View;

// TODO: логи на вызов функций + время;
// TODO: логи ввиде паттерна декоратор
public class Program {

    public static void main(String[] args) {
        Computable computable = new LoggerDecorator(new CalculationModel());
        View view = new View();
        Controller controller = new Controller(computable, view);
        controller.getData();
        controller.calculate();
    }

}
