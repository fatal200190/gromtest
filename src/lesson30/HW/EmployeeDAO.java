package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    static Set<Employee> employees = new HashSet<>();

    public Employee saveEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }

    public Set<Employee> employeesByProject(String projectName){
        Set<Employee> result = new HashSet<>();
        for (Employee employee : employees){
            for (Project project : employee.getProjects()){
                if (project.getName() != null && project.getName().equals(projectName)) {
                    result.add(employee);
                }
            }
        }
        return result;
    }

}
