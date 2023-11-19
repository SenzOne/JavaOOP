package homework5.controller;

import homework3and4.data.StudentGroup;
import homework5.model.*;
import homework5.service.DataService;
import homework5.service.StudentGroupService;
import homework5.view.GroupView;
import homework5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView view = new StudentView();
    private final GroupView groupView = new GroupView();

    public void createStudent(String name, String surname){
        service.create(name, surname, Type.STUDENT);
    }

    public void createTeacher(String name, String surname){
        service.create(name, surname, Type.TEACHER);
    }

    public void printAllStudents(){
        List<User> userList = service.getUserList();
        for (User user: userList){
            view.printOnConsole((Student) user);
        }
    }

    public List<Student> getAllStudents(){
        List<User> userList = service.getUserList();
        List<Student> resStudent = new ArrayList<>();
        for(User user: userList){
            if(user instanceof Student){
                resStudent.add((Student) user);
            }
        }
        return resStudent;
    }

    public void createGroup(Teacher teacher, List<Student> students){
        studentGroupService.create(teacher, students);
    }

    public void printGroup(int index){
        StudyGroup group = studentGroupService.getGroup(index);
        groupView.printOnConsole(group);
    }
}
