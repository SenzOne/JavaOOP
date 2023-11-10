package homework3and4;

import homework3and4.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StudentGroupService {
    private StudentGroup studentGroup;


    public StudentGroup createGroup(){
        studentGroup = new StudentGroup();
        return studentGroup;
    }

    public StudentGroup createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
        return studentGroup;
    }

    public StudentGroup createGroup(List<Student> studentList, Teacher teacher){
        studentGroup = new StudentGroup(studentList);
        return studentGroup;
    }


    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public StudentGroup addStudentToGroup(Student student){
        studentGroup.addStudentToGroup(student);
        return getStudentGroup();
    }


    public void printStudentGroup(Teacher teacher){
        System.out.println(teacher);
        System.out.println("Номер группы: " + studentGroup.getGroupId());
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
        Random random = new Random();
        if (studentGroup == null){
            createGroup(new ArrayList<>());
        }
        return new Student(firstName, secondName, lastName, random.nextInt(1, 5));
    }
}
