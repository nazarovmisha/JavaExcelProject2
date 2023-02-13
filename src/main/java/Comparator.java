public class Comparator {
    private Comparator() {
    }


    public static StudentEnum getStudentEnum(StudentEnum studentEnum) {
        switch (studentEnum) {
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            case CURRENT_COURSE_NUMBER:
                return new StudentCurrentCourseNumberComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();

        }
        return null;
    }

    public static UniversityEnum getUniversityEnum(UniversityEnum universityEnum) {
        switch (universityEnum) {
            case FULL_NAME : return new UniversityFullNameComparator();
            case UNIVERSITY_ID:return new UniversityIdComparator();
            case UNIVERSITY_SHORT_NAME:return new UniversityShortNameComparator();
            case UNIVERSITY_YEAR_OF_FOUNDATION:return new UniversityYearOfFoundationComparator();
            case default: return new UniversityFullNameComparator();


        }
    }
}
