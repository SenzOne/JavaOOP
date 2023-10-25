package homework3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupController controller = new StudentGroupController();

        Student s1 = new Student("Аркадий", 1, 5);
        Student s2 = new Student("Иван", 2, 4);
        Student s3 = new Student("Анна", 3, 3);

        controller.createStudentGroup(List.of(s1, s2, s3));
        controller.print();
    }

}
