package proz.Hw8.t2;

public class Salary {

    public int getSum(Employee[] employeeArray){
        int salary=0;
        for (Employee employee: employeeArray){
            salary+=employee.salary;
        }
        return salary;
    }
}
