package homework5and6.service;

import homework5and6.model.Student;
import homework5and6.model.StudyGroup;
import homework5and6.model.Teacher;

import java.util.List;

/**
 * Interface Segregation (Принцип разделения интерфейсов)
 * Интерфейс StudyGroupServiceInterface содержит только те функции, которые реализуются в
 * классе StudyGroupService
 */
public interface StudyGroupServiceInterface extends ServiceInterface{
    void create(Teacher teacher, List<Student> students);
    StudyGroup getGroup(int index);
}