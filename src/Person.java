import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public abstract class Person {

    private String name;
    private int age;
    private int height;
    private int children;
    private double maxSalary;
    private double minSalary;
    private LocalDate dateOfBirth;
    protected static final int BEFORE_WORK_AGE = 18;

    public Person() {
    }

    public Person(String name, int age, int height, int children, LocalDate dateOfBirth, double minSalary, double maxSalary) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.children = children;
        this.dateOfBirth = dateOfBirth;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }
    public int yearsOfExperience() {
        return age - BEFORE_WORK_AGE;
    }
    public void getInfo(){
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Number of children: " + children);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Years of work experience: " + yearsOfExperience());
        System.out.println("------------------");
    }
    public void greetings(){
        System.out.println("Hello, my name is " + name);
    }

    public abstract double findAverageSalary();
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getChildren() {
        return children;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    }


