package skrupskaya.Hw8;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int age, boolean gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public boolean isSameName(Employee employee) {
        return super.getName().equalsIgnoreCase(employee.getName());
    }
}
