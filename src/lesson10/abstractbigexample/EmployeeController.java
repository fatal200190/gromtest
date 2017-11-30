package lesson10.abstractbigexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class EmployeeController {
    private Employee[] employees = new Employee[100];


    void paySaleryToEmployees() {
        for (Employee employee : employees) {
            employee.paySalery();
            System.out.println("Salary was paid successfully to " + employee.getName() + "employee");
        }
    }
    /*void paySaleryToEmployees(){
        for (Employee employee : employees){
            if(employee instanceof DeveloperEmployee){
                int newBalance = employee.getBankAccount().getBalance() + employee.getSaleryPerMonth() + 1000;
                employee.getBankAccount().setBalance(newBalance);
            }
            else if(employee instanceof ManagerEmployee){
                int newBalance = employee.getBankAccount().getBalance() + employee.getSaleryPerMonth();
                newBalance += newBalance * 0.25;
                employee.getBankAccount().setBalance(newBalance);
            }
            Sys.out.println("Salary was paid successfully to " + employee.getName() + "employee");
            }
        }*/
    }
