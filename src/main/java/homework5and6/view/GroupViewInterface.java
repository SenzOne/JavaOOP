package homework5and6.view;

import homework5and6.model.Student;
import homework5and6.model.StudyGroup;

import java.util.List;

/**
 * Interface Segregation (Принцип разделения интерфейсов)
 * Интерфейс GroupViewInterface содержит только те функции, которые реализуются в
 * классе GroupView
 */
public interface GroupViewInterface extends View{
    void printOnConsole(StudyGroup studyGroup);
    void printStudyGroup(List<Student> students);

}