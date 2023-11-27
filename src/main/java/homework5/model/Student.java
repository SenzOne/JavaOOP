package homework5.model;

/**
 * Single Responsibility (Принцип единственной ответственности)
 * Класс наследуется от Абстрактного класса и может работать только со студентами.
 *
 *  Liskov Substitution (Принцип подстановки Барбары Лисков). Класс Student
 *  расширяет и дополняет класс user при этом объекты класса User могут заменяться объектами типа
 *  Student без негативных последствий для функциональности программы.
 */

public class Student extends User{
    private int studentId;
    private static int counter = 1;

    {
        studentId = counter;
        counter++;
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getName(), super.getSurname());
    }
}
