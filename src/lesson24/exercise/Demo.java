package lesson24.exercise;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

    GeneralDAO<Sys> systemDAO = new GeneralDAO<>();
    Sys sys1 = new Sys(11,"...");
    systemDAO.save(sys1);
    System.out.println(Arrays.toString(systemDAO.getrAll()));

    systemDAO.save(sys1);
    System.out.println(Arrays.toString(systemDAO.getrAll()));

    GeneralDAO<Tool> toolDAO = new GeneralDAO<>();
    Tool tool1 = new  Tool("rrr","ppp");
    toolDAO.save(tool1);
    System.out.println(Arrays.toString(toolDAO.getrAll()));

    GeneralDAO<Order> orderDAO = new GeneralDAO<>();
    }
}
