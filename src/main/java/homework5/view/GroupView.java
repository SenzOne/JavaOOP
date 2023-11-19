package homework5.view;

import homework3and4.data.StudentGroup;
import homework5.model.Student;
import homework5.model.StudyGroup;

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
