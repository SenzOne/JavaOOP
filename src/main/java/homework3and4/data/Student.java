package homework3and4.data;

public class Student extends User implements Comparable<Student> {
   private int srBall;

    public Student(String firstName, String secondName, String lastName, int srBall) {
        super(firstName, secondName, lastName);
        this.srBall = srBall;
    }


    public int getSrBall() {
        return srBall;
    }

    public void setSrBall(int srBall) {
        this.srBall = srBall;
    }

    @Override
    public String toString() {
        return String.format("id: %s %s %s srBall: %s",super.getId(), super.getFirstName(), super.getSecondName(), srBall);
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
