package ilya.ilya.HW8;

public class Employee {

    private String name, gender;
    private int age, salary;

    public Employee(String name, String gender, int age, int salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public boolean isSameName(Employee employee) {
        if (employee == null) {
            return false;
        }
        return this.name != null && this.name.equals(employee.getName());
    }

    public int getSalary() {
        return salary;
    }
}

