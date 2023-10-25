package homework3;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
    };

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void printStudentGroup(){
        for (Student st: studentGroup){
            System.out.println(st);
        }
    }
}
