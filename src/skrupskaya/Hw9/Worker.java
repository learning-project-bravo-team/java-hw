package skrupskaya.Hw9;

public class Worker extends Employee {


    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getSalary() {
        System.out.println("Worker's salary = base salary");
        return super.getBaseSalary();
    }
}
