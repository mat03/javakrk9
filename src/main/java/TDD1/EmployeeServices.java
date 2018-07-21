package TDD1;

public interface EmployeeServices {
    public void add(Employee emp);
    public void remove(Long id);
    public boolean exists(Employee emp);
    public int count();
}
