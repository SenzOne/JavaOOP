package homework3and4;

import homework3and4.controller.StudentGroupController;
import homework3and4.controller.TeacherController;
import homework3and4.data.Stream;
import homework3and4.data.Student;
import homework3and4.data.StudentGroup;
import homework3and4.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupController controller = new StudentGroupController();
        TeacherController teacherController = new TeacherController();

        // создаем группу
        StudentGroup group1 =  controller.createStudentGroup();

        // Добавляем в группу студентов
        group1.addStudentsToGroup(List.of(
                controller.create("Аркадий", "Aндреевич", "Фрундзе"),
                controller.create("Петров", "Петр", "Петрович"),
                controller.create("Аркадий", "Васильевич", "Бодрый"),
                controller.create("Иван","Михайлович", "Прохоров"),
                controller.create("Анна","Витальевна","Волож")
        ));

        // Добавляем в группу отдельного студента
        Student student5 = controller.create("Петров", "Петр", "Петрович");
        controller.addStudentToGroup(student5);


        // Добавляем в группу учителей
        Teacher teacher1 =  teacherController.create("Иван", "Иванович", "Иванов");
        teacherController.create("Ярослав", "Генадьевич", "Рыбаков");
        controller.print(group1, teacher1);

        // вывод всех учителей
        teacherController.print();
        System.out.println("\nСортировка по среднему баллу: ");
        controller.print(controller.sortedStudentGroupBySrBall());

        System.out.println("\nСортировка по ФИО: ");
        controller.print(controller.sortedStudentGroupByFIO());

        StudentGroup g2 = controller.createStudentGroup();
        StudentGroup g3 = controller.createStudentGroup();
        Stream stream = new Stream();
        stream.addStudentGroup(group1);
        stream.addStudentGroup(g2);
        stream.addStudentGroup(g3);

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        System.out.println("\nПоток содержит учебных групп:  " + stream.getGroupList().size());
        controller.sortStreams(streams);
    }
}
