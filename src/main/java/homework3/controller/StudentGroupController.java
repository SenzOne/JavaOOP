package homework3.controller;

import homework3.StudentGroupService;
import homework3.data.Stream;
import homework3.StreamService;
import homework3.data.Student;
import homework3.data.User;
import homework3.view.IUserView;
import homework3.view.StudentGroupView;
import homework3.view.UserView;

import java.util.List;

public class StudentGroupController {

    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();
    StreamService streamService = new StreamService();

    public void createStudentGroup(List<Student> studentList){
        studentGroupService.createGroup(studentList);
    }

    public void print(){
        studentGroupView.printStudentGroup(studentGroupService.getListStudent());
    }

    public void print(List<Student> list){
        studentGroupView.printStudentGroup(list);
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

//    @Override
//    public Student create(String firstName, String secondName, String lastName) {
//
//    }
}
