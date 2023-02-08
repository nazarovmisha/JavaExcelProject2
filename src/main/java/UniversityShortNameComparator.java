import java.util.Comparator;

public class UniversityShortNameComparator implements Comparator<University> {
    @Override
    public int compare(University o1, University o2) {
        return o1.getShortName().compareTo(o2.getShortName());
    }
}
