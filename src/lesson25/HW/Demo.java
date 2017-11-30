package lesson25.HW;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {

    GeneralDAO<Sys> sysDAO= new GeneralDAO<>();
    Sys sys1 = new Sys(11,"...");
    Sys sys2 = new Sys(10,"...");
    Sys sys3 = new Sys(12,"..1");

    sysDAO.save(sys1);
    sysDAO.save(sys2);
    sysDAO.save(sys3);
    System.out.println(Arrays.toString(sysDAO.getAll()));

    GeneralDAO<Tool>toolDAO = new GeneralDAO<>();
    Tool tool1 = new Tool("exp","fin");
    Tool tool2 = new Tool("exp1","fin");
    Tool tool3 = new Tool("exp2","fin");

    toolDAO.save(tool1);
    System.out.println(Arrays.toString(toolDAO.getAll()));

    GeneralDAO<Order>orderDAO = new GeneralDAO<>();
    Order order1 = new Order(111,"pay");

    orderDAO.save(order1);
    System.out.println(Arrays.toString(orderDAO.getAll()));

    }
}
