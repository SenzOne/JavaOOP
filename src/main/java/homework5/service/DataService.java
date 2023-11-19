package homework5.service;

import homework5.model.Student;
import homework5.model.Teacher;
import homework5.model.Type;
import homework5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();


    public void create(String name, String surname, Type type) {
        if (type == Type.STUDENT) {
            Student student = new Student(name, surname);
            userList.add(student);
        } else if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(name, surname);
            userList.add(teacher);
        }
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<User> getAllStudent() {
        List<User> users = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                users.add(user);
            }
        }
        return users;
    }
}
