public class Enrollment {
    private User user;
    private Course course;

    public Enrollment(User user, Course course) {
        this.user = user;
        this.course = course;
    }

    @Override
    public String toString() {
        return user.getName() + " enrolled in " + course.getTitle();
    }
}
