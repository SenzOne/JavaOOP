package homework3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int groupSize1 = o1.getGroupList().size();
        int groupSize2 = o2.getGroupList().size();

        if (groupSize1 < groupSize2) {
            return -1;
        } else if (groupSize1 > groupSize2) {
            return 1;
        } else {
            return 0;
        }
    }
}
