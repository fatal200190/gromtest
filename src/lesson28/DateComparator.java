package lesson28;

import java.util.Comparator;

public class DateComparator implements Comparator<Capability> {
    @Override
    public int compare(Capability o1, Capability o2) {
        if (o1.getDateCreated() == null && o2.getDateCreated() != null)
            return 1;
        if (o1.getDateCreated() != null && o2.getDateCreated() == null)
            return -1;
        if (o1.getDateCreated() == null && o2.getDateCreated() == null)
            return 0;
        return (int) (o1.getDateCreated().getTime() - o2.getDateCreated().getTime());
    }
}
