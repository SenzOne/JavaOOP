package homework3and4.service;

import homework3and4.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teacherList = new ArrayList<>();

    public Teacher createTeacher(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teacherList.add(teacher);
        return teacher;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void delTeacher(Teacher teacher){
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).equals(teacher)){
                teacherList.remove(teacher);
            }
        }
    }

    public Teacher setTeacher(Teacher teacher, String firstName, String secondName){
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        return teacher;
    }
}
