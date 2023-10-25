package homework3;

import java.util.List;

public class StudentGroupController {

    StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudentGroup(List<Student> studentList){
        studentGroupService.createGroup(studentList);
    }

    public void print(){
        studentGroupService.printStudentGroup();
    }
}
