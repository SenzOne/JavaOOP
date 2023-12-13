package homework3and4.controller;

import homework3and4.data.Teacher;
import homework3and4.service.TeacherService;
import homework3and4.view.UserView;


public class TeacherController implements UserController<Teacher>{
    UserView<Teacher> teacherUserView = new UserView<>();
    TeacherService teacherService = new TeacherService();
    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return teacherService.createTeacher(firstName, secondName, lastName);
    }

    public void print(){
        System.out.println("\nСписок учителей: ");
        teacherUserView.sendOnConsole(teacherService.getTeacherList());
    }

    public void setTeacherName(Teacher teacher, String firstName, String secondName){
        teacherService.setTeacher(teacher, firstName, secondName);
    }
}
