package ilya.ilya.HW8;

public class Salary {

    private int sum = 0;

    public int getSum(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }
}

