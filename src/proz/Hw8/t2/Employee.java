package proz.Hw8.t2;

public class Employee extends Person {
    int salary;

    public Employee(String name, int age, String gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.name.equalsIgnoreCase(employee.name);
    }

}
