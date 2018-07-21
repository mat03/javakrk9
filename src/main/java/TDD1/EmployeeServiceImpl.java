package TDD1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeServiceImpl implements EmployeeServices{
    private Set<Employee> employees = new HashSet<>();

    @Override
    public void add(Employee emp) {
        employees.add(emp);
    }

    @Override
    public void remove(Long id) {
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if(emp.getId().equals(id)) {
                it.remove();
            }
        }
    }

    @Override
    public boolean exists(Employee emp) {
        // TODO: add implementation
        //throw new NotImplementedException();
        return employees.contains(emp);
    }

    @Override
    public int count() {
        return employees.size();
    }
}
