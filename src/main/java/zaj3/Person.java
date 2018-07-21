package zaj3;

public class Person implements Comparable<Person>{
    private long id;
    private String email;

    public Person(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return (int)id - (int)o.id;
    }
}
