package proz.Hw9;

public class Task3Hw9 {
    private Employee[] employees;
    private Manager[] managers;

    public Task3Hw9 setEmployees(Employee[] employees) {
        this.employees = employees;
        return this;
    }
    public Task3Hw9 setManagers(Manager[] managers) {
        this.managers = managers;
        return this;
    }

    public boolean isExistEmployeeByName(String name) {

        for (Employee employee : employees) {

            if (employee.getName().equalsIgnoreCase(name)) {
                return true;
            }

        }
        return false;
    }

    public boolean isExistEmployeeByNamePart(String part) {
        part = part.toLowerCase();
        for (Employee employee : employees) {
            if (employee.getName().toLowerCase().contains(part)) {
                return true;
            }
        }
        return false;
    }

    public double getSalaryBudget() {
        double salaryBudget = 0;
        for (int i = 0; i < employees.length; i++) {
            salaryBudget += employees[i].getSalary();
        }
        return salaryBudget;
    }

    public double getLowestSalary() {
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public double getBiggestSalary() {
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public int getLowestNumberOfSubordinates() {
        int minSubordinates = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minSubordinates) {
                minSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return minSubordinates;
    }

    public int getBiggestNumberOfSubordinates() {
        int maxSubordinates = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxSubordinates) {
                maxSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return maxSubordinates;
    }

    public double getMaxIncreaseSalary() {
        double maxIncreaseSalary = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalary() - manager.getBaseSalary()) > maxIncreaseSalary) {
                maxIncreaseSalary = manager.getSalary() - manager.getBaseSalary();
            }
        }
        return maxIncreaseSalary;
    }

    public double getMinIncreaseSalary() {
        double minIncreaseSalary = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalary() - manager.getBaseSalary()) < minIncreaseSalary) {
                minIncreaseSalary = manager.getSalary() - manager.getBaseSalary();
            }
        }
        return minIncreaseSalary;
    }

}

//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров

//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
