package homework3;

public class Student implements Comparable<Student> {
   private String firstName;
   private String secondName;
   private String lastName;
   private int studentId;
   private int srBall;

    public Student(String firstName, int studentId, int srBall) {
        this.firstName = firstName;
        this.studentId = studentId;
        this.srBall = srBall;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSrBall() {
        return srBall;
    }

    public void setSrBall(int srBall) {
        this.srBall = srBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.srBall == o.getSrBall())
            return 0;
        if(this.srBall > o.srBall)
            return 1;
        return -1;
    }
}