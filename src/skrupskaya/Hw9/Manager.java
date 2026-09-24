package skrupskaya.Hw9;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        if (numberOfSubordinates > 0) {
            this.numberOfSubordinates = numberOfSubordinates;
        } else {
            System.out.println("Incorrect numberOfSubordinates");
        }
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        if (numberOfSubordinates > 0) {
            this.numberOfSubordinates = numberOfSubordinates;
        } else {
            System.out.println("Incorrect numberOfSubordinates");
        }
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            System.out.println("Formula: base salary + base salary * N / 100 * 3");//as I got base salary itself is a part of the salary
            return super.getBaseSalary() + super.getBaseSalary() * getNumberOfSubordinates() / 100 * 3;
        } else {
            System.out.println("Manager's salary = base salary");
            return super.getBaseSalary();
        }
    }
}
