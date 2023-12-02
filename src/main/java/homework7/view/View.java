package homework7.view;
import java.util.Scanner;

/**
 * Класс View отвечает за пользовательский интерфейс и взаимодействие с пользователем.
 */
public class View {
    private int dateLength = 15;

    /**
     * Запрашивает ввод данных у пользователя.
     *
     * @return Строка, введенная пользователем.
     */
    public String prompt(){
        System.out.print("Введи строку с вида a + b: ");
        Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();
    }


    /**
     * Выводит на экран результат вычислений без первых символов (длина dateLength).
     *
     * @param input Результат вычислений для вывода.
     */
    public void cleanPrint(String input){
        String substring = input.substring(dateLength);
        System.out.println(substring);
    }
}
