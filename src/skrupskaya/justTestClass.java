import skrupskaya.Hw6.HW61;
import skrupskaya.Hw6.SKrupHW63;
import skrupskaya.Hw7.SKrupHW7;
import skrupskaya.Hw8.Block;
import skrupskaya.Hw8.Fighter;
import skrupskaya.Hw9.*;

static void main(){
    System.out.println("Test");

    HW61.summ();//print the summa of multi array
    HW61.max();//print the max number from the array
    HW61.countElements();//print the N of elements in the array
    SKrupHW63.leftPyramid();
    System.out.println("______________________");
    SKrupHW63.rightPyramid();
    System.out.println("______________________");
    SKrupHW63.fullPyramid();

    Block a = new Block(new int[] {2, 4, 6});
    System.out.println(a.getWidth());
    System.out.println(a.getLength());
    System.out.println(a.getHeight());
    System.out.println(a.getVolume());
    System.out.println(a.getSurfaceArea());

    Fighter lew = new Fighter("Lew", 10, 2);
    Fighter harry = new Fighter("Harry", 5, 4);
    System.out.println(Fighter.returnTheWinnerName(lew, harry));


    System.out.println("summ is: ");
    System.out.println(SKrupHW7.summ(5, 8));//summ
    System.out.println("substraction: ");
    System.out.println(SKrupHW7.substract(2, 7));//substract
    System.out.println("multiplication: ");
    SKrupHW7.multiply(6, 0);//mult
    System.out.println("division: ");
    System.out.println(SKrupHW7.divide(5, 3));//divide
    System.out.println("int * 2: ");
    System.out.println(SKrupHW7.doubleInteger(45));

    System.out.println(SKrupHW7.isLove(12, 24));//false
    System.out.println(SKrupHW7.isLove(25, 37));//false
    System.out.println(SKrupHW7.isLove(24, 29));//true
    System.out.println(SKrupHW7.isLove(29, 24));//true
    System.out.println("String: ");
    System.out.println(SKrupHW7.numberToString(123));
    System.out.println("the min is: ");
    System.out.println(SKrupHW7.findSmallestInt(new int[]{34, 15, 88, 2}));
    System.out.println("String: ");
    System.out.println(SKrupHW7.countingSheep(3));


    Employee employee = new Employee("Employee", 100);
    System.out.println(employee.getBaseSalary());
    employee.setBaseSalary(-10);
    System.out.println(employee.getBaseSalary());
    employee.setName("Er");
    System.out.println(employee.getName());
    employee.setName(null);
    System.out.println(employee.getName());
    Worker worker = new Worker("Worker", 200);
    System.out.println(worker.getSalary());
    worker.setName(null);
    System.out.println(worker.getName());
    worker.setName("er");
    System.out.println(worker.getName());
    worker.setBaseSalary(-12);
    System.out.println(worker.getSalary());
    Manager manager = new Manager("Manager", 300, 10);
    System.out.println(manager.getSalary());
    Director director = new Director("Director", 400, 100);
    System.out.println(director.getSalary());
    Manager manager1 = new Manager("Manager1", 300, 0);
    System.out.println(manager1.getSalary());
    Director director1 = new Director("Director1", 400, -10);
    System.out.println(director1.getNumberOfSubordinates());
    director1.setNumberOfSubordinates(-2345);
    System.out.println(director1.getNumberOfSubordinates());
    System.out.println(director1.getSalary());

    Employee[] employees = new Employee[4];
    employees[0] = new Worker("Sara", 1000);
    employees[1] = new Manager("Uta", 1000, 1);
    employees[2] = new Director("Urlih", 1000, 2);
    employees[3] = new Employee("Alize", 1000);// salary does not count

    Manager[] managers = new Manager[2];
    managers[0] = new Manager("Uta", 1000, 0);
    managers[1] = new Director("Urlih", 1000, 1);


    Office office = new Office();
    System.out.println(office.searchEmployeeByName(employees, "sara"));
    System.out.println(office.searchEmployeeByPartName(employees, "uta"));
    System.out.println(office.searchEmployeeByPartName(employees, "ara"));

    System.out.println(office.searchTotalSalary(employees));
    System.out.println(office.searchMaxSalary(employees));

    System.out.println(office.searchMaxSalary(managers));
    System.out.println(office.searchMaxDiffBetweenSalaryAndBaseSalary(managers));
    System.out.println(office.searchMinDiffBetweenSalaryAndBaseSalary(managers));
    System.out.println(office.searchMaxNumberOfSubordinates(managers));
}
