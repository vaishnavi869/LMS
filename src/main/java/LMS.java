public class LMS {
    public String getCourseName() {
        return "Java Programming";
    }

    public boolean isCourseAvailable(String course) {
        return course != null && !course.isEmpty();
    }
}