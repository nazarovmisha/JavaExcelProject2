
import java.io.IOException;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {
        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = ComparatorClass
                .getUniversityEnum(UniversityEnum.UNIVERSITY_ID);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student>students=Input.inputStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator=ComparatorClass.getStudentEnum(StudentEnum.FULL_NAME);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }

}

