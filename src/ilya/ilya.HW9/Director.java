package ilya.ilya.HW9;

public class Director extends Manager {

    @Override
    public int getSalary() {
        if (this.getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return this.getBaseSalary() * (this.getNumberOfSubordinates() / 100 * 9);
        }
    }

}
