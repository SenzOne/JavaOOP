package homework5;

import homework5.controller.Controller;
import homework5.model.Student;
import homework5.model.Teacher;
import homework5.model.User;

public class Program {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1");
        controller.createStudent("2", "2");

        controller.createTeacher("Teacher1", "Teacher1");

        controller.createGroup(new Teacher("t1", "2"), controller.getAllStudents());
        controller.printGroup(0);
    }
}
