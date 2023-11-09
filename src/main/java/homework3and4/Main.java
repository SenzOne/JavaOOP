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

        Student student1 = new Student("Аркадий", "Васильевич", "Бодрый", 6);
        Student student2 = new Student("Иван","Михайлович", "Прохоров", 2);
        Student student3 = new Student("Анна","Витальевна","Волож", 3);
        Student student4 = controller.create("Аркадий", "Aндреевич", "Фрундзе");

        Teacher teacher1 =  teacherController.create("Иван", "Иванович", "Иванов");
        Teacher teacher2 =  teacherController.create("Семен", "Генадьевич", "Рыбаков");



        StudentGroup s1 =  controller.createStudentGroup(List.of(student1, student2, student3, student4), teacher1);
        controller.print(s1, teacher1);
        controller.print(s1);
        teacherController.print();
        System.out.println("\nСортировка по среднему баллу: ");
        controller.print(controller.sortedStudentGroupBySrBall());

        System.out.println("\nСортировка по ФИО: ");
        controller.print(controller.sortedStudentGroupByFIO());

        StudentGroup g1 = new StudentGroup(new ArrayList<>());
        StudentGroup g2 = new StudentGroup(new ArrayList<>());
        Stream stream = new Stream();
        stream.addStudentGroup(g1);
        stream.addStudentGroup(g2);

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        System.out.println("\nПоток содержит учебных групп:  " + stream.getGroupList().size());
        controller.sortStreams(streams);
    }
}
