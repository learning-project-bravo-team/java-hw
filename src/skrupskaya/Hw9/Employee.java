package skrupskaya.Hw9;

public class Employee {
    private String name;
    private int baseSalary;//integers for money, not double
    private int salary;//the same as for baseSalary

    public Employee(String name, int baseSalary) {
        if (name != null && name.length() > 2) {
            this.name = name;
        } else {
            System.out.println("Incorrect name was not set");
        }
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Incorrect base salary was not set");
        }
        System.out.println("_____________________________________________________________");
        System.out.println("Employee has been created: " + name);
        System.out.println("_____________________________________________________________");
    }

    public void setName(String name) {
        if (name != null && name.length() > 2) {
            this.name = name;
        } else {
            System.out.println("Incorrect name was not set");
        }
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Incorrect base salary was not set");
        }
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getSalary() {
        System.out.println("Employee salary has not been counted");
        return salary;// there is no any rule here how much of baseSalary should be added to get the salary, so this salary is not included into the scope
    }
}
