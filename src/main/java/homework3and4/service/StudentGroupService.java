package homework3and4;

import homework3and4.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;
    private Teacher teacher;

    public StudentGroup createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
        return studentGroup;
    };

    public StudentGroup createGroup(List<Student> studentList, Teacher teacher){
        studentGroup = new StudentGroup(studentList);
        return studentGroup;
    };

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void printStudentGroup(){
        System.out.println(studentGroup.getGroupId());
        for (Student st: studentGroup){
            System.out.println(st);
        }
    }

    public void printStudentGroup(Teacher teacher){
        System.out.println(teacher);
        System.out.println(studentGroup.getGroupId());
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

    public Student createStudent(String firstName, String secondName, String lastName){
        if (studentGroup == null){
            createGroup(new ArrayList<>());
        }
        return new Student(firstName, secondName, lastName, 0);
    }

}
