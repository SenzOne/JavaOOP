package homework3and4.data;

public class Teacher extends User{

    private int groupId;
    public Teacher(String firstName, String secondName, String lastName, int groupId) {
        super(firstName, secondName, lastName);
        this.groupId = groupId;
    }

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return String.format("Teacher: %s %s", super.getFirstName(), super.getSecondName());
    }
}
