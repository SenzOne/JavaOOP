package homework7.controller;

import homework7.model.CalculationModel;
import homework7.model.GettingData;
import homework7.model.Logger;
import homework7.view.View;

public class Controller {
    private double firstNum;
    private double lastNum;
    private char operator;
    View view;
    Logger logger = new Logger();

    CalculationModel calculationModel;


    public Controller(CalculationModel calculationModel, View view) {
        this.calculationModel = calculationModel;
        this.view = view;
    }

    public void getData() {
        GettingData gettingData = new GettingData(view.prompt());
        if (gettingData.checkData()) {
            this.firstNum = gettingData.getDoubleFirstInput();
            this.lastNum = gettingData.getDoubleLastInput();
            this.operator = gettingData.getOperator();
        }
    }

    public void calculate() {
        switch (operator) {
            case '+':
                logger.logging("Сумма");
                System.out.println(calculationModel.summation(firstNum, lastNum));
                break;

            case '-':
                System.out.println(calculationModel.subtraction(firstNum, lastNum));
                break;

            case '*':
                System.out.println(calculationModel.multiplication(firstNum, lastNum));
                break;

            case '/':
                System.out.println(calculationModel.division(firstNum, lastNum));
                break;
        }
    }
}
