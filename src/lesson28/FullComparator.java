package lesson28;

import java.util.Comparator;
import java.util.Date;

public class FullComparator implements Comparator<Capability> {

    @Override
    public int compare(Capability o1, Capability o2) {
        if (itemCheck(o1.getChannelName(),o2.getChannelName()) != 0)
            return itemCheck(o1.getChannelName(),o2.getChannelName());
        if (itemCheck(o1.getFingerprint(),o2.getFingerprint()) != 0)
            return itemCheck(o1.getFingerprint(),o2.getFingerprint());
        return itemCheck(o1.getDateCreated(),o2.getDateCreated());

    }

        private<T extends Comparable> int itemCheck(T t1, T t2) {
            if (t1 == null)
                return (t2 == null) ? 0 : 1;
            if (t2 == null)
                return -1;
            return  t1.compareTo(t2);
        }
}