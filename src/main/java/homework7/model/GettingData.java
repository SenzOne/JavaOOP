package homework7.model;

/**
 * Класс GettingData представляет данные, полученные из ввода пользователя.
 */
public class GettingData {
    private final String inputData;

    /**
     * Конструктор класса GettingData.
     *
     * @param inputData Строка ввода, содержащая данные для обработки.
     */
    public GettingData(String inputData) {
        this.inputData = inputData;
    }

    /**
     * Проверяет корректность введенных данных.
     *
     * @return true, если данные корректны, иначе false.
     */
    public boolean checkData() {
        String[] res = inputData.split(" ");
        if (res.length != 3) {
            System.out.println("Неверный формат воода");
            return false;
        } else return true;
    }

    /**
     * Получает первое введенное число.
     *
     * @return Первое число из введенных данных.
     */
    public double getDoubleFirstInput() {
        return Double.parseDouble(inputData.split(" ")[0]);
    }

    /**
     * Получает последнее введенное число.
     *
     * @return Последнее число из введенных данных.
     */
    public double getDoubleLastInput() {
        return Double.parseDouble(inputData.split(" ")[2]);
    }


    /**
     * Получает оператор математической операции из введенных данных.
     *
     * @return Оператор математической операции.
     */
    public char getOperator() {
        return (inputData.split(" ")[1].charAt(0));
    }
}
