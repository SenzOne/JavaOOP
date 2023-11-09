package homework3.data;

import homework3.data.Student;
import homework3.data.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;

// группа студентов
public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
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
