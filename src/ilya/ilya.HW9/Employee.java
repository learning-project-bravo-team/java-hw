package ilya.ilya.HW9;

public class Employee {

    private String name;
    private int baseSalary;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int baseSalary, int Salary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salary = Salary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
