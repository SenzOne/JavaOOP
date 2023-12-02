package homework7.controller;


import homework7.model.Computable;
import homework7.model.GettingData;
import homework7.view.View;

public class Controller {
    private double firstNum;
    private double lastNum;
    private char operator;
    View view;

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
        } else {
           getData();
        }
    }

    public void calculate() {
        switch (operator) {
            case '+':
                view.cleanPrint(computable.summation(firstNum, lastNum));
                break;

            case '-':
                view.cleanPrint(computable.subtraction(firstNum, lastNum));
                break;

            case '*':
                view.cleanPrint(computable.multiplication(firstNum, lastNum));
                break;

            case '/':
                view.cleanPrint(computable.division(firstNum, lastNum));
                break;
        }
    }
}
