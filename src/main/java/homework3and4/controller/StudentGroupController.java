package homework3and4.controller;

import homework3and4.StudentGroupService;
import homework3and4.data.*;
import homework3and4.StreamService;
import homework3and4.view.UserView;

import java.util.List;

public class StudentGroupController implements UserController<Student> {

    StudentGroupService studentGroupService = new StudentGroupService();
    StreamService streamService = new StreamService();
    UserView<Student> studentUserView = new UserView<>();

    public StudentGroup createStudentGroup(List<Student> studentList){
        return studentGroupService.createGroup(studentList);
    }

    public StudentGroup createStudentGroup(){
        return studentGroupService.createGroup();
    }

    public StudentGroup createStudentGroup(List<Student> studentList, Teacher teacher){
        return studentGroupService.createGroup(studentList, teacher);
    }

    public StudentGroup addStudentToGroup(Student student){
        return studentGroupService.addStudentToGroup(student);
    }


    public void print(StudentGroup studentGroup, Teacher teacher){
        studentGroupService.printStudentGroup(teacher);
    }

    public void print(List<Student> list){
        studentUserView.sendOnConsole(list);
    }

    public void print(List<Student> list, Teacher teacher){
        System.out.println("Учитель группы: " + teacher);
        studentUserView.sendOnConsole(list);
    }


    public List<Student> sortedStudentGroupBySrBall(){
        return studentGroupService.getSortedStudentGroupBySRBall();
    }

    public List<Student> sortedStudentGroupByFIO(){
        return studentGroupService.getSortedStudentGroupByFIO();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return studentGroupService.createStudent(firstName, secondName, lastName);
    }
}
