public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        CourseManager courseManager = new CourseManager();

        // Sample user and course creation
        User user1 = userManager.createUser("Alice", "alice@example.com");
        Course course1 = courseManager.createCourse("Java Programming", "Learn Java from scratch");

        // Enroll user in the course
        Enrollment enrollment = courseManager.enrollUser(user1, course1);
        System.out.println(enrollment);
    }
}
