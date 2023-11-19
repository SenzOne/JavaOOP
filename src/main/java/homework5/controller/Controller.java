package homework5.controller;

import homework5.model.*;
import homework5.service.DataService;
import homework5.service.StudyGroupService;
import homework5.view.GroupView;
import homework5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
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

    public List<Student> getStudents(List<Integer> index){
        List<User> userList = service.getUserList();
        List<Student> resStudent = new ArrayList<>();
        for (int i: index){
            resStudent.add((Student) userList.get(i));
        }
        return resStudent;
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
        studyGroupService.create(teacher, students);
    }

    public void printGroup(int index){
        StudyGroup group = studyGroupService.getGroup(index);
        groupView.printOnConsole(group);
    }
}
