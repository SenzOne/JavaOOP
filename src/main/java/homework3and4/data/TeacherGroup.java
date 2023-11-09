package homework3and4.data;

import java.util.List;

public class TeacherGroup{
    private List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void addGroup(Teacher teacher){
        teacherList.add(teacher);
    }
}
