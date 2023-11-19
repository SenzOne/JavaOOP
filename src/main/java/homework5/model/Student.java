package homework5.model;

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
}
