package homework3and4;

import homework3and4.data.Stream;
import homework3and4.data.StreamComparator;

import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}
