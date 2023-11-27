package homework5.model;


/**
 * Single Responsibility (Принцип единственной ответственности)
 * Класс наследуется от Абстрактного класса и может работать только со студентами
 */

public class Teacher extends User {
    private int teacherId;
    private static int counter = 1;

    {
        teacherId = counter;
        counter++;
    }

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.getName(), super.getSurname());
    }
}
