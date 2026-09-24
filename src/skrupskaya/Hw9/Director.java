package skrupskaya.Hw9;

public class Director extends Manager {

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            System.out.println("Formula: base salary + base salary * N / 100 * 9");//as I got base salary itself is a part of the salary
            return super.getBaseSalary() + super.getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
        } else {
            System.out.println("Director's salary = base salary");
            return super.getBaseSalary();
        }
    }
}
