package DP;


public class Access {
    private final static String USER_NAME = "mat";
    private final static String PASSWORD = "mat";

    private Access()
    {}

    public static boolean getAccess(String userName, String password) {
        if(userName.equals(USER_NAME) && password.equals(PASSWORD)) {
            return true;
        }
        return false;
    }

}
