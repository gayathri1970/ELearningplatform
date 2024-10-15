import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public User createUser(String name, String email) {
        User user = new User(name, email);
        users.add(user);
        return user;
    }
}
