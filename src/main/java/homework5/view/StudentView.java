package homework5.view;

import homework5.model.Student;

public class StudentView implements StudentViewInterface {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }
}
