package homework5.controller;

import homework5.model.Student;
import homework5.model.Type;
import homework5.model.User;
import homework5.service.DataService;
import homework5.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();

    public void  createStudent(String name, String surname){
        service.create(name, surname, Type.STUDENT);
    }

    public void getAllStudents(){
        List<User> userList = service.getUserList();
        for (User user: userList){
            view.printOnConsole((Student) user);
        }
    }
}
