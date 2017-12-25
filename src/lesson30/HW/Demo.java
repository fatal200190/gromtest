package lesson30.HW;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ICT","US", 1000);
        Customer customer2 = new Customer("Gentherm","DE", 5000);
        Customer customer3 = new Customer("Daewoo","KR", 3000);

        Project project1 = new Project("Bank",customer1);
        Project project2 = new Project("Payment",customer2);
        Project project3 = new Project("Sales",customer3);

        Set<Project>projects1 = new HashSet<>();
        projects1.add(project1);
        projects1.add(project2);

        Set<Project>projects2 = new HashSet<>();
        projects1.add(project2);
        projects1.add(project3);

        Department department1;
//        department1 = new Department(DepartmentType.DEVELOPERS,);
//        Department department2 = new Department(DepartmentType.DEVELOPERS,);

//        Department department3 = new Department(DepartmentType.DEVELOPERS,);
//
//        Employee employee1 = new Employee("Ivan","Bar", new Date(), Position.DEVELOPER, department1,projects1);
//        Employee employee2 = new Employee("Paul","Vendor", new Date(), Position.DEVELOPER, department1,projects1);
//        Employee employee3 = new Employee("Sam","Loft", new Date(), Position.DESIGNER, department2,projects2);
//        Employee employee4 = new Employee("Ann","Lama", new Date(), Position.DESIGNER, department2,projects2);
//        Employee employee5 = new Employee("Mary","Favb", new Date(), Position.LEAD_DESIGNER, department2,projects2);
//        Employee employee6 = new Employee("Roman","Maran", new Date(), Position.TEAM_LEAD, department1,projects1);
//
//        Set<Employee>depart1 = new HashSet<>();
//        depart1.add(employee1);
//        depart1.add(employee2);
//        depart1.add(employee6);
//
//        Set<Employee>depart2 = new HashSet<>();
//        depart1.add(employee3);
//        depart1.add(employee4);
//        depart1.add(employee5);


    }
}
