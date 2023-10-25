package homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupController controller = new StudentGroupController();

        Student student1 = new Student("Аркадий", "A", "A", 1, 3);
        Student student2 = new Student("Иван","П", "П", 2, 50);
        Student student3 = new Student("Анна","В","В", 3, 4);

        controller.createStudentGroup(List.of(student1, student2, student3));

        System.out.println(student1.compareTo(student2));

        List<Student> studentList= List.of(new Student[]{student1, student2, student3});
        controller.createStudentGroup(studentList);
        controller.print();
        System.out.println("Сортировка по среднему баллу: ");
        controller.print(controller.sortedStudentGroupBySrBall());

        System.out.println("Сортировка по ФИО: ");
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
        System.out.println("Поток содержит учебных групп:  " + stream.getGroupList().size());
        controller.sortStreams(streams);
    }
}
