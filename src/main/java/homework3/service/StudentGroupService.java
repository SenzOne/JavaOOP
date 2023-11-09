package homework3;

import homework3.data.Student;
import homework3.data.StudentGroup;
import homework3.data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<Student> getSortedStudentGroupBySRBall(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getListStudent(){
        return studentGroup.getStudentList();
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator());
        return studentList;
    }
}
