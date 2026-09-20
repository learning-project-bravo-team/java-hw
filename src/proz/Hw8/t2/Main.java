package proz.Hw8.t2;

import java.awt.*;

public class Main {

    static void main(String[] args) {
        Person p1 = new Person("Dima", 30, "male");
        Person p2 = new Person("Ann", 20, "female");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println("------------------");
        Employee emp1 = new Employee("Dima", 25, "male", 1000);
        Employee emp2 = new Employee("Yura", 25, "male", 2000);
        Employee emp3 = new Employee("Masha", 25, "female", 7000);
        System.out.println(emp1.isSameName(emp1));
        Salary salary = new Salary();
        System.out.println(salary.getSum(new Employee[]{emp1,emp2,emp3}));
    }
}
