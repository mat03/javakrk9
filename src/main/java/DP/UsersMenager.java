package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersMenager {
    private static final Map<String, User>  usersList = new HashMap<>();

    public void addUser(User user) {
        usersList.put(user.getUserName(), user);
    }

    public void usersInit() {
        addUser(new User("a","b"));
        addUser(new User("c","d"));
        addUser(new User("e","f"));
    }

    public boolean exists(String User, String Password) {
        User user = usersList.get(User);

        if(user == null){
            return false;
        }
        return true;
    }



}
