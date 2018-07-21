package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetUsers {
    private static GetUsers getUsersInstance = null;
    private Map<String, User> usersList = new HashMap<>();

    public static GetUsers getInstance() {
        if(getUsersInstance == null) {
            getUsersInstance = new GetUsers();
            getUsersInstance.initUsers();
        }
        return getUsersInstance;
    }

    public Map<String, User> getUsersList() {
        return usersList;
    }

    public void add(User user) {
        usersList.put(user.getUserName(), user);
    }

    public boolean exist(User user) {
        if (usersList.get(user.getUserName()) == null) {
            return false;
        }
        return true;
    }

    private void initUsers() {
        add(new User("a","b"));
        add(new User("c","d"));
        add(new User("e","f"));
    }

}
