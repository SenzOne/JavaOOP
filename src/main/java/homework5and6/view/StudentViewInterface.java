package homework5and6.view;

import homework5and6.model.Student;

/**
 * Interface Segregation (Принцип разделения интерфейсов)
 * Интерфейс StudentViewInterface содержит только те функции, которые реализуются в
 * классе StudentView
 */
public interface StudentViewInterface extends View{
    void printOnConsole(Student student);
}
