package homework3and4.controller;

import homework3and4.data.Teacher;
import homework3and4.view.UserView;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController<Teacher>{
    UserView<Teacher> teacherUserView = new UserView<>();
    List<Teacher> teachers = new ArrayList<>();
    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teachers.add(teacher);
        return teacher;
    }

    public void print(){
        teacherUserView.sendOnConsole(teachers);
    }

}
