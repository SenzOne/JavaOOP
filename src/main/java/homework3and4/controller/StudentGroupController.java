package homework3and4.controller;

import homework3and4.StudentGroupService;
import homework3and4.data.*;
import homework3and4.StreamService;
import homework3and4.view.StudentGroupView;
import homework3and4.view.UserView;

import java.util.List;

public class StudentGroupController implements UserController<Student> {

    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();
    StreamService streamService = new StreamService();
    UserView<Student> studentUserView = new UserView<Student>();

    public StudentGroup createStudentGroup(List<Student> studentList){
        return studentGroupService.createGroup(studentList);
    }
    public StudentGroup createStudentGroup(List<Student> studentList, Teacher teacher){
        return studentGroupService.createGroup(studentList, teacher);
    }


    public void print(StudentGroup studentGroup){
        studentGroupService.printStudentGroup();
    }


    public void print(StudentGroup studentGroup, Teacher teacher){
        studentGroupService.printStudentGroup(teacher);
    }

    public void print(List<Student> list){
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
