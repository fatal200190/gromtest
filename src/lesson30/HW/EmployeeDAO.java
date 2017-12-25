package lesson30.HW;

public class EmployeeDAO {
    public boolean findProjectFromEmployee(Employee employee, String projectName){
        for (Project project : employee.getProjects()){
            if (project.getName() != null && project.getName().equals(projectName))
                return true;
            break;
        }
        return false;
    }

}
