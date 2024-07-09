import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person worker= new Worker("Irina", 35, 163, 0, LocalDate.of(1988,9,19), 1500, 2820);
        worker.getInfo();
        PensionFund pensionFund = new PensionFund();
        System.out.println("The average salary of " + worker.getName() + " is " + worker.findAverageSalary());
        System.out.println("The future retirement of " + worker.getName() + " is " + PensionFund.calculationOfFutureRetirement(worker));
        workable human = new Worker("Irina", 35, 163, 0, LocalDate.of(1988,9,19), 1500, 2820);
        human.goToWork();
        Person pensioner = new Pensioner("Boris", 67, 180, 4, LocalDate.of(1955, 8, 3), 1200, 5600);
        pensioner.getInfo();
        workable oldHuman = (workable) pensioner;
        oldHuman.goToWork();


    }


}