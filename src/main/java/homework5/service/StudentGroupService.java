package homework5.service;

import homework5.model.Student;
import homework5.model.StudyGroup;
import homework5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    List<StudyGroup> groups = new ArrayList<>();
    public void create(Teacher teacher, List<Student> students){
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        groups.add(studyGroup);
    }

    public StudyGroup getGroup(int index){
        return groups.get(index);
    }
}
