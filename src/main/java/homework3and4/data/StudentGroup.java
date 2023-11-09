package homework3and4.data;

import java.util.Iterator;
import java.util.List;

// группа студентов
public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private int groupId;

    {
        groupId += 100;
    }

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getGroupId() {
        return groupId;
    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public void addGroup(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
