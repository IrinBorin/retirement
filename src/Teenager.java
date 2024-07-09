import java.time.LocalDate;

public class Teenager extends Person {

    @Override
    public double findAverageSalary() {
        return 0;
    }

    public Teenager(String name, int age, int height, int children,
                    LocalDate dateOfBirth, double minSalary, double maxSalary) {
        super(name, age, height, children, dateOfBirth, minSalary, maxSalary);
    }
}