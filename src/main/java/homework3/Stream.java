package homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> groupList;

    public Stream() {
        groupList = new ArrayList<>();
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
