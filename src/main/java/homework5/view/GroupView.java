package homework5.view;

import homework3and4.data.StudentGroup;
import homework5.model.StudyGroup;

public class GroupView {
    public void printOnConsole(StudyGroup studyGroup){
        System.out.printf("группа: %s Учитель: %s", studyGroup.getId(), studyGroup.getTeacher1());
        System.out.printf("Список учеников: %s", studyGroup.getStudentList());
    }
}
