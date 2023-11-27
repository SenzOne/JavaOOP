package homework5and6.service;

import homework5and6.model.Student;
import homework5and6.model.StudyGroup;
import homework5and6.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    List<StudyGroup> groups = new ArrayList<>();
    public void create(Teacher teacher, List<Student> students){
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        groups.add(studyGroup);
    }

    public StudyGroup getGroup(int index){
        return groups.get(index);
    }
}
