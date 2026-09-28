package skrupskaya.Hw9;

public class Office {


    public Employee searchEmployeeByName(Employee[] array, String name) {
        for (Employee employee : array) {
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println("The employee: " + employee.getName());
                return employee;
            }
        }
        return null;
    }

    public Employee searchEmployeeByPartName(Employee[] array, String partOfName) {
        for (Employee employee : array) {
            if (employee.getName().toLowerCase().contains(partOfName.toLowerCase())) {
                System.out.println("The employee: " + employee.getName());
                return employee;
            }
        }
        return null;
    }

    public int searchTotalSalary(Employee[] array) {
        int result = 0;
        for (Employee employee : array) {
            result += employee.getSalary();
        }
        System.out.println("The total salary: ");
        return result;
    }

    public int searchMaxSalary(Employee[] array) {
        int result = Integer.MIN_VALUE;
        for (Employee employee : array) {
            if (employee.getSalary() > result) {
                result = employee.getSalary();
            }
        }
        System.out.println("The Max salary: ");
        return result;
    }

    public int searchMaxNumberOfSubordinates(Manager[] array) {
        int result = 0;
        for (Manager manager : array) {
            if (manager.getNumberOfSubordinates() > result) {
                result = manager.getNumberOfSubordinates();
            }
        }
        System.out.println("The Max NumberOfSubordinates: ");
        return result;
    }

    public int searchMaxDiffBetweenSalaryAndBaseSalary(Manager[] array) {
        int result = 0;
        for (Manager manager : array) {
            if ((manager.getSalary() - manager.getBaseSalary()) > result) {
                result = (manager.getSalary() - manager.getBaseSalary());
            }
        }
        System.out.println("The Max DiffBetweenSalaryAndBaseSalary: ");
        return result;
    }

    public int searchMinDiffBetweenSalaryAndBaseSalary(Manager[] array) {
        int result = Integer.MAX_VALUE;
        for (Manager manager : array) {
            if ((manager.getSalary() - manager.getBaseSalary()) < result) {
                result = (manager.getSalary() - manager.getBaseSalary());
            }
        }
        System.out.println("The Min DiffBetweenSalaryAndBaseSalary: ");
        return result;
    }
}
