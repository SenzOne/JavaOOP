package homework7;

import homework7.controller.Controller;
import homework7.model.CalculationModel;
import homework7.view.View;

// TODO: логи на вызов функций + время;
// TODO: логи ввиде паттерна декоратор
public class Program {

    public static void main(String[] args) {
        CalculationModel calculationModel = new CalculationModel();
        View view = new View();
        Controller controller = new Controller(calculationModel, view);
        controller.getData();
        controller.calculate();
    }

}
