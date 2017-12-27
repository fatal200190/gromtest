package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    static Set<Employee> employees = new HashSet<>();

    public Employee saveEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }
    public Set<Employee> findEmployeeByProject(Department department, String project){
        Set<Employee>result = new HashSet<>();
        for (Employee employee : department.getEmployees()){
            if (employee != null && findProjectFromEmployee(employee,project))
                result.add(employee);
        }
        return result;
    }

    public boolean findProjectFromEmployee(Employee employee, String projectName){
        for (Project project : employee.getProjects()){
            if (project.getName() != null && project.getName().equals(projectName))
                return true;
            break;
        }
        return false;
    }

}
