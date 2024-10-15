import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();

    public Course createCourse(String title, String description) {
        Course course = new Course(title, description);
        courses.add(course);
        return course;
    }

    public Enrollment enrollUser(User user, Course course) {
        Enrollment enrollment = new Enrollment(user, course);
        enrollments.add(enrollment);
        return enrollment;
    }
}
