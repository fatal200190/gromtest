package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class DepartmentDAO {
    private Set<Department>departments = new HashSet<>();

    public DepartmentDAO() {
    }

    public Set<Department> getDepartments() {
        return departments;
    }
}
