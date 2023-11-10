package homework3and4.service;

import homework3and4.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();

    public Teacher createTeacher(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teacherList.add(teacher);
        return teacher;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
