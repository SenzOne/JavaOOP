package homework7.controller;

import homework7.model.CalculationModel;
import homework7.model.Computable;
import homework7.model.GettingData;
import homework7.model.Logger;
import homework7.view.View;

public class Controller {
    private double firstNum;
    private double lastNum;
    private char operator;
    View view;
    Logger logger = new Logger();

    Computable computable;


    public Controller(Computable computable, View view) {
        this.computable = computable;
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

                System.out.println(computable.summation(firstNum, lastNum));
                break;

            case '-':
                System.out.println(computable.subtraction(firstNum, lastNum));
                break;

            case '*':
                System.out.println(computable.multiplication(firstNum, lastNum));
                break;

            case '/':
                System.out.println(computable.division(firstNum, lastNum));
                break;
        }
    }
}
