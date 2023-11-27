package homework5.controller;

import homework5.model.*;
import homework5.service.DataService;
import homework5.service.StudyGroupService;
import homework5.view.GroupView;
import homework5.view.GroupViewInterface;
import homework5.view.StudentView;
import homework5.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private DataService service;
    private StudyGroupService studyGroupService;
    private StudentView view;
    private GroupView groupView;


    /**
     *  Dependency Inversion (Принцип инверсии зависимостей)
     *  Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
     *  И те, и другие должны зависеть от абстракций.
     *  Абстракции не должны зависеть от деталей.
     *  Детали должны зависеть от абстракций.
     *  Таким образом контроллер принимает в свой конструктор экземпляры классов
     *  DataService, studyGroupService, StudentView, GroupView.
     *  StudentView и GroupView наследуются от родительского интерфейса View.
     *  DataService и studyGroupService наследуются от родительского интерфейса Service
     */
    public Controller(DataService service, StudyGroupService studyGroupService, StudentView view, GroupView groupView) {
        this.service = service;
        this.studyGroupService = studyGroupService;
        this.view = view;
        this.groupView = groupView;
    }

    public void setService(DataService service) {
        this.service = service;
    }

    public void setStudyGroupService(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    public void setGroupView(GroupView groupView){
        this.groupView = groupView;
    }

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

    /** Open-Closed (Принцип открытости-закрытости)
     * Класс должен быть открыт для расширения, но не для модификации
     */

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
