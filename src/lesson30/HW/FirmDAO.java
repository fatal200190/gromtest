package lesson30.HW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FirmDAO {
    DepartmentDAO departmentDAO = new DepartmentDAO();
    Firm firm = new Firm();
    public Set<Employee> employeesByProject(String projectName) {
        Set<Employee> employees = new HashSet<>();
        Iterator<Department>departmentIterator = firm.getDepartments().iterator();
            while (departmentIterator.hasNext()){
                employees.addAll(departmentDAO.findEmployeeByProject(departmentIterator.next(), projectName));
        }
        return employees;
    }
}
