import java.util.Comparator;

public class StudentUniversityIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getUniversityId().compareTo(o2.getUniversityId());
    }
}
