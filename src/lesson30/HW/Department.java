package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private DepartmentType type;
    private Set<Employee> employees = new HashSet<>();

    public Department(DepartmentType type, Set<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
