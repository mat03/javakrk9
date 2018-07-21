package DP.models;

import java.util.Objects;

public class User {
    private String login;
    private String name;
    private String password;
    private Integer age;

    public User(String login, String name, String password, Integer age) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.name = "anonymous";
        this.age = 0;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login);
    }
}
