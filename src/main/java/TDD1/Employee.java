package TDD1;

import java.util.Objects;

public class Employee extends Person{
    private Double salary;

    public Employee(Long id, String name, Double salary) {
        super(id, name);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), salary);
    }
}
