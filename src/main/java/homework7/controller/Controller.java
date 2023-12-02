package homework7.controller;


import homework7.model.Computable;
import homework7.model.GettingData;
import homework7.view.View;

/**
 * Класс Controller отвечает за управление вычислениями и представлением.
 */
public class Controller {
    private double firstNum;
    private double lastNum;
    private char operator;
    View view;

    Computable computable;

    /**
     * Конструктор класса Controller.
     *
     * @param computable Объект, реализующий интерфейс Computable для выполнения вычислений.
     * @param view       Объект класса View для отображения информации.
     */
    public Controller(Computable computable, View view) {
        this.computable = computable;
        this.view = view;
    }

    /**
     * Метод для получения данных от пользователя.
     */
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


    /**
     * Метод для выполнения вычислений на основе полученных данных.
     */
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
