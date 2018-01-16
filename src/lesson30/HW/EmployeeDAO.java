package lesson30.HW;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {
    private Set<Employee> employees = new HashSet<>();

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Employee saveEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }

    public Set<Employee> employeesByProject(String projectName){
        Set<Employee> result = new HashSet<>();
        for (Employee employee : employees){
            if (employee != null){
            for (Project project : employee.getProjects()){
                if (project != null){
                if (project.getName() != null && project.getName().equals(projectName)) {
                    result.add(employee);
                }
                }
                }
            }
        }
        return result;
    }

    public Set<Project> projectsByEmployee(Employee employee) throws Exception {
        if (employee == null){
            throw new Exception("Empolyee can not be null");
        }
        for (Employee em : employees){
            if (em != null && em.equals(employee)){
                return em.getProjects();
            }
        }
        throw new Exception("There is no such employee in the firm");
    }

    public Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType){
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            if (em != null && em.getDepartment().getType() != null && em.getDepartment().getType().equals(departmentType) && em.getProjects().isEmpty()){
                result.add(em);
            }
        }
        return result;
    }

    public Set<Employee> employeesWithoutProject(){
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            if (em.getProjects().isEmpty()){
                result.add(em);
            }
        }
        return result;
    }

    public Set<Employee> employeesByTeamLead(Employee lead) throws Exception {
            Set<Employee> result = new HashSet<>();
            if (lead == null){
                throw new Exception("Lead can not be null");
            }
        for (Employee employee : employees){
                if(employee != null){
                    for (Project project : employee.getProjects()){
                        if (project != null){
                        if (project != null && lead.getProjects().contains(project) && !employee.getPosition().equals(Position.TEAM_LEAD) &&
                                !employee.getPosition().equals(Position.LEAD_DESIGNER)) {
                            result.add(employee);
                        }
                        }
                    }
                }
        }
            return result;
    }

    public Set<Employee> employeesByProjectEmployee(Employee employee) throws Exception {
        if (employee.getProjects().isEmpty()){
            throw new Exception("Employee has not projects");
        }
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            if (em != null) {
                for (Project project : em.getProjects()){
                    if (employee.getProjects().contains(project))
                    result.add(em);
                }
            }
        }
        return result;
    }

    public Set<Employee> employeesByCustomerProjects(Customer customer) throws Exception {
        if (customer == null){
            throw new Exception("Customer null");
        }
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            if (em != null){
            for (Project project : em.getProjects()) {
                if (project != null){
                if (project.getCustomer() != null && project.getCustomer().equals(customer)) {
                    result.add(em);
                }
                }
                }
            }
        }
        return result;
    }

    public Set<Employee> teamLeadsByEmployee(Employee employee) throws Exception {
        if (employee == null){
            throw new Exception("Employee is null");
        }
        if (employee.getProjects().isEmpty()){
            throw new Exception("Employee has not projects with lead");
        }
        Set<Employee> result = new HashSet<>();
        for (Project project : employee.getProjects()){
            if (project != null){
            for (Employee em : employeesByProject(project.getName())){
                if (em != null) {
                    if (em.getPosition() != null && em.getPosition().equals(Position.TEAM_LEAD) || em.getPosition().equals(Position.LEAD_DESIGNER)) {
                        result.add(em);
                    }
                    }
                }
            }
        }
        return result;
    }

    public Set<Project> projectsByCustomer(Customer customer) throws Exception {
        if (customer == null){
            throw new Exception("Customer is null");
        }
        Set<Project> result = new HashSet<>();
        for (Employee employee : employees){
            if (employee != null){
            for (Project project : employee.getProjects()) {
                if (project != null) {
                    if (project.getCustomer().equals(customer)) {
                        result.add(project);
                    }
                }
            }
            }
        }
        return result;
    }


}
