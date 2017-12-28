package lesson30.HW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
            for (Project project : employee.getProjects()){
                if (project.getName() != null && project.getName().equals(projectName)) {
                    result.add(employee);
                }
            }
        }
        return result;
    }

    public Set<Project> projectsByEmployee(Employee employee) throws Exception {
        for (Employee em : employees){
            if (em == employee){
                return em.getProjects();
            }
        }
        throw new Exception("There is no such employee in the firm");
    }

    public Set<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType){
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            if (em.getDepartment().getType().equals(departmentType) && em.getProjects().isEmpty()){
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

    public Set<Employee> employeesByTeamLead(Employee lead) {
            Set<Employee> result = new HashSet<>();

            for (Project project : lead.getProjects()){
            result.addAll(employeesByProject(project.getName()));
            }

        Iterator<Employee>iterator = result.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee.getPosition().equals(Position.TEAM_LEAD) || employee.getPosition().equals(Position.LEAD_DESIGNER)){
                iterator.remove();
            }
        }
            return result;
    }

    public Set<Employee> employeesByProjectEmployee(Employee employee){
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            if (em.getProjects().equals(employee.getProjects())){
                result.add(em);
            }
        }
        return result;
    }

    public Set<Employee> employeesByCustomerProjects(Customer customer){
        Set<Employee> result = new HashSet<>();
        for (Employee em : employees){
            for (Project project : em.getProjects()){
                if (project.getCustomer().equals(customer)){
                    result.add(em);
                }
            }
        }
        return result;
    }

    public Set<Employee> teamLeadsByEmployee(Employee employee){
        Set<Employee> result = new HashSet<>();
        for (Project project : employee.getProjects()){
            for (Employee em : employeesByProject(project.getName())){
                if (em.getPosition().equals(Position.TEAM_LEAD) || em.getPosition().equals(Position.LEAD_DESIGNER)){
                    result.add(em);
                }
            }
        }
        return result;
    }

    public Set<Project> projectsByCustomer(Customer customer){
        Set<Project> result = new HashSet<>();
        for (Employee employee : employees){
            for (Project project : employee.getProjects()){
                if (project.getCustomer().equals(customer)){
                    result.add(project);
                }
            }
        }
        return result;
    }


}
