package DP.models;

import java.util.Map;

public class UsersList {
    private static UsersList ourInstance = new UsersList();

    public static UsersList getInstance() {
        return ourInstance;
    }

    private UsersList() {
    }

    private static Map<String, User> userList;

    public static void addUser(String login, String password) {
        userList.put(login, new User(login,password));
    }

    public static boolean exist(String login, String password) {
        User user = userList.get(login);
        if(user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }

    public static void initiazlize() {
        addUser("a","a");
        addUser("b","b");
        addUser("c","c");
        addUser("d","d");
    }
}
