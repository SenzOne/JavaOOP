package homework5and6.view;

import homework5and6.model.Student;
import homework5and6.model.StudyGroup;

import java.util.List;

public class GroupView {
    public void printOnConsole(StudyGroup studyGroup) {
        System.out.printf("\nГруппа: %s Учитель: %s\n", studyGroup.getId(), studyGroup.getTeacher1());
        System.out.println("Список учеников:");
        printStudyGroup(studyGroup.getStudentList());
    }


    private void printStudyGroup(List<Student> students) {
        for (Student student : students) {

            System.out.printf("id: %s %s\n", student.getStudentId(), student);
        }
    }
}
