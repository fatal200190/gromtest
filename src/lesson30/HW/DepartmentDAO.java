package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class DepartmentDAO {
    EmployeeDAO employeeDAO = new EmployeeDAO();
    public Set<Employee> findEmployeeByProject(Department department, String project){
        Set<Employee>result = new HashSet<>();
        for (Employee employee : department.getEmployees()){
            if (employee != null && employeeDAO.findProjectFromEmployee(employee,project))
                result.add(employee);
        }
        return result;
    }

}
