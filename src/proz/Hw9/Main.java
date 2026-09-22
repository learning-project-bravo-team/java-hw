package proz.Hw9;

public class Main {
    static void main(String[] args) {
        Employee employee1 = new Employee();
        Worker worker1 = new Worker();
        Manager manager1 = new Manager();
        Director director1 = new Director();
        employee1.setBaseSalary(100);
        employee1.setName("Dima");
        worker1.setBaseSalary(employee1.getBaseSalary());
        System.out.println(worker1.getSalary());
        manager1.setNumberOfSubordinates(0);
        manager1.setBaseSalary(employee1.getBaseSalary());
        director1.setBaseSalary(manager1.getBaseSalary());
        System.out.println("Manager1: " + manager1.getSalary());
        director1.setNumberOfSubordinates(manager1.getNumberOfSubordinates());
        System.out.println("Director1: " + director1.getSalary());
        System.out.println("************************************ below Task 3 ************************************");

        Employee employee11 = new Employee();
        Employee employee12 = new Employee();
        Employee employee13 = new Employee();
        Employee employee14 = new Employee();
        Employee employee15 = new Employee();
        employee11.setName("Dima");
        employee12.setName("Sveta");
        employee13.setName("Valera");
        employee14.setName("Anna");
        employee15.setName("Elena");
        employee11.setBaseSalary(1000);
        employee12.setBaseSalary(2000);
        employee13.setBaseSalary(2500);
        employee14.setBaseSalary(3000);
        employee15.setBaseSalary(5000);
        Employee[] employees = {
                employee11,
                employee12,
                employee13,
                employee14,
                employee15,
        };

        Manager manager11 = new Manager();
        Manager manager12 = new Manager();
        Manager manager13 = new Manager();
        Manager manager14 = new Manager();
        manager11.setNumberOfSubordinates(200);
        manager12.setNumberOfSubordinates(3);
        manager13.setNumberOfSubordinates(10);
        manager14.setNumberOfSubordinates(50);
        manager11.setBaseSalary(5555);
        manager12.setBaseSalary(3333);
        manager13.setBaseSalary(10000);
        manager14.setBaseSalary(20000);
        Manager[] managers = {
                manager11,
                manager12,
                manager13,
                manager14,
        };

        Task3Hw9 task3Hw9 = new Task3Hw9();
        task3Hw9.setEmployees(employees).setManagers(managers);
        System.out.println("поиск сотрудника в массиве по его имени: " + task3Hw9.isExistEmployeeByName("diMa"));
        System.out.println("поиск сотрудника в массиве по его имени: " + task3Hw9.isExistEmployeeByName("vova"));
        System.out.println("поиск сотрудника в массиве по вхождению указанной строки в его имени: " + task3Hw9.isExistEmployeeByNamePart("nna"));
        System.out.println("поиск сотрудника в массиве по вхождению указанной строки в его имени: " + task3Hw9.isExistEmployeeByNamePart("ha"));
        System.out.println("подсчет зарплатного бюджета для всех сотрудников в массиве: " + task3Hw9.getSalaryBudget());
        System.out.println("поиск наименьшей зарплаты в массиве: " + task3Hw9.getLowestSalary());
        System.out.println("поиск наибольшей зарплаты в массиве: " + task3Hw9.getBiggestSalary());
        System.out.println("поиск наименьшего количества подчиненных в массиве менеджеров: " + task3Hw9.getLowestNumberOfSubordinates());
        System.out.println("поиск наибольшего количества подчиненных в массиве менеджеров: " + task3Hw9.getBiggestNumberOfSubordinates());
        System.out.println("поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров: " + task3Hw9.getMaxIncreaseSalary());
        System.out.println("поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров: " + task3Hw9.getMinIncreaseSalary());

    }
}
