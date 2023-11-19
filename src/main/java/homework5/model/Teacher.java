package homework5.model;

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
}
