import java.time.LocalDate;
import java.util.Random;

public class Pensioner extends Person implements workable{

    private static final double MEDIUM_SALARY = 2000.0;

    public Pensioner(String name, int age, int height, int children, LocalDate dateOfBirth,double minSalary, double maxSalary) {
        super(name, age, height, children, dateOfBirth, minSalary,maxSalary);
    }

    @Override
    public double findAverageSalary() {
        double minSalary = getMinSalary();
        double maxSalary = getMaxSalary();
        return CalculatorUtils.averageOfThreeSalaries(minSalary, maxSalary, MEDIUM_SALARY);
    }
    public void goToWork() {
        String [] arr = {"I happily go to work", "I don't want to go to work"};
        Random random = new Random();
        int randomLine = random.nextInt(arr.length);
        System.out.println(arr[randomLine]);
    }
}
