package homework5.model;

import java.util.List;

public class StudyGroup {
    private int id;
    private static int counter = 100;
    private Teacher teacher;
    private List<Student> studentList;


    {
        id = counter;
        counter++;
    }

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }


    public Teacher getTeacher1() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
