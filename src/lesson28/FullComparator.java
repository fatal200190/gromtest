package lesson28;

import java.util.Comparator;
import java.util.Date;

public class FullComparator implements Comparator<Capability> {
    private NullDetector<String> nullDetector1 = new NullDetector<>();
    private NullDetector<Date> nullDetector2 = new NullDetector<>();

    @Override
    public int compare(Capability o1, Capability o2) {
        if (o1.getChannelName() == null || o2.getChannelName() == null)
            return nullDetector1.nullReplacement(o1.getChannelName(), o2.getChannelName());
        else if (!o1.getChannelName().equals(o2.getChannelName()))
            return o1.getChannelName().compareTo(o2.getChannelName());
        else if (o1.getFingerprint() == null || o2.getFingerprint() == null)
            return nullDetector1.nullReplacement(o1.getFingerprint(), o2.getFingerprint());
        else if (!o1.getFingerprint().equals(o2.getFingerprint()))
            return o1.getFingerprint().compareTo(o2.getFingerprint());
        else if (o1.getDateCreated() == null || o2.getDateCreated() == null)
            return nullDetector2.nullReplacement(o1.getDateCreated(), o2.getDateCreated());
        else if (o1.getDateCreated() != o2.getDateCreated())
            return (int) (o1.getDateCreated().getTime() - o2.getDateCreated().getTime());
        else return 0;
    }

    private class NullDetector<T> {
        private int nullReplacement(T t1, T t2) {
            if (t1 != null && t2 == null)
                return -1;
            else if (t1 == null && t2 != null)
                return 1;
            else return 0;
        }
    }
}