package ilya.ilya.HW9;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (this.getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return this.getBaseSalary() * (this.getNumberOfSubordinates() / 100 * 3);
        }
    }
}
