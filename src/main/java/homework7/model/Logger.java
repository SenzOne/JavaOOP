package homework7.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    String filePath = "src/main/java/homework7/logger.txt";

    BufferedWriter bufferedWriter;

    /**
     * Метод logging осуществляет запись данных в лог-файл.
     *
     * @param data Данные, которые требуется записать в файл лога.
     */

    public void logging(String data){
        {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
                bufferedWriter.newLine();
                bufferedWriter.write(data);
                bufferedWriter.close();

            } catch (IOException e) {
                System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
            }
        }
    }
}

