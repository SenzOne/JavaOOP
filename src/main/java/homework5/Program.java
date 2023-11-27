package homework5;

import homework5.controller.Controller;
import homework5.model.Teacher;
import homework5.service.DataService;
import homework5.service.StudyGroupService;
import homework5.view.GroupView;
import homework5.view.StudentView;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        Controller controller = new Controller(
                new DataService(), new StudyGroupService(), new StudentView(), new GroupView()
        );
        controller.createStudent("Филипп", "Сычев");
        controller.createStudent("Вера", "Павлова");
        controller.createTeacher("Андрей", "Герасимов");
        controller.createGroup(new Teacher("Иван", "Дроздов"), controller.getAllStudents());
        controller.printGroup(0);

        controller.createStudent("Антон", "Зайцев");
        controller.createStudent("Елизавета", "Корнилова");
        controller.createTeacher("Андрей", "Герасимов");
        controller.createGroup(new Teacher("Михаил", "Лопатин"), controller.getStudents(List.of(3, 4)));
        controller.printGroup(1);
    }
}
