package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class Controller {
    EmployeeDAO employeeDAO = new EmployeeDAO();

    public Employee saveEmployee(Employee employee){
        return employeeDAO.saveEmployee(employee);
    }

    public Set<Employee> employeesByProject(String projectName){
        return employeeDAO.employeesByProject(projectName);
    }

    public Set<Project> projectsByEmployee(Employee employee) throws Exception {
        return employeeDAO.projectsByEmployee(employee);
    }

    public Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType){
        return employeeDAO.employeesByDepartmentWithoutProject(departmentType);
    }

    public Set<Employee> employeesWithoutProject(){
        return employeeDAO.employeesWithoutProject();
    }

    public Set<Employee> employeesByTeamLead(Employee lead) throws Exception {
        return employeeDAO.employeesByTeamLead(lead);
    }

    public Set<Employee> employeesByProjectEmployee(Employee employee){
        return employeeDAO.employeesByProjectEmployee(employee);
    }

    public Set<Employee> employeesByCustomerProjects(Customer customer){
        return employeeDAO.employeesByCustomerProjects(customer);
    }

    public Set<Employee> teamLeadsByEmployee(Employee employee){
        return employeeDAO.teamLeadsByEmployee(employee);
    }

    public Set<Project> projectsByCustomer(Customer customer){
        return employeeDAO.projectsByCustomer(customer);
    }

}
