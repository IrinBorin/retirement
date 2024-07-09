import java.time.LocalDate;

public class Worker extends Person implements workable{

    public Worker(String name, int age, int height, int children, LocalDate dateOfBirth, double minSalary, double maxSalary) {
        super(name, age, height, children, dateOfBirth, minSalary, maxSalary);
    }

    @Override
    public double findAverageSalary() {
        double minSalary = getMinSalary();
        double maxSalary = getMaxSalary();
        return CalculatorUtils.averageOfTwoSalaries(minSalary, maxSalary);
    }
    public void goToWork() {
        System.out.println("I happily go to work.");
    }

}
