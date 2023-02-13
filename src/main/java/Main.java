import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        UniversityEnum universityEnum = Comparator.getUniversityEnum(UniversityEnum.UNIVERSITY_SHORT_NAME);
        universities.stream()
                .sorted(UniversityEnum)
                .forEach(System.out::println);

        List<Student> students = Input.inputStudents("src/main/resources/universityInfo.xlsx");
        StudentEnum studentEnum = Comparator.getStudentEnum(StudentEnum.FULL_NAME);
    }

}

