package skrupskaya.Hw8;

public class Salary {
    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (Employee employee : employeeArray) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
