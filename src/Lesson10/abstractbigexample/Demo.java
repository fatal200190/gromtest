package Lesson10.abstractbigexample;

import java.util.Arrays;

/**
 * Created by Alex on 05.10.2017.
 */
public class Demo {
    public static void main(String[] args) {

        //***changePosition кейс
        //сохранение позиции в историю +
        //изменение позиции +
        //сохранение null -
        DeveloperEmployee developerEmployee = new DeveloperEmployee();
        developerEmployee.setCurPosition("Developer");
        developerEmployee.changePosition("Main");
        System.out.println(developerEmployee.getCurPosition());
        developerEmployee.changePosition("Boss");
        System.out.println(developerEmployee.getCurPosition());
        System.out.println(Arrays.toString(developerEmployee.getPositionsWorked()));
        developerEmployee.changePosition(null);
        System.out.println(developerEmployee.getCurPosition());
        System.out.println(Arrays.toString(developerEmployee.getPositionsWorked()));

        //***paySalery кейс
        //выплата зарплаты +
        // +
        // -
        developerEmployee.setSaleryPerMonth(1000);
        developerEmployee.paySalery();

    }
}
