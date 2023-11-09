package homework3;

import homework3.data.Stream;
import homework3.data.StreamComparator;

import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}
