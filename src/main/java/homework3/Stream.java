package homework3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> groupList;

    public Stream(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        groupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groupList.iterator();
    }
}
