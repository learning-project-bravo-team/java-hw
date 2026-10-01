package ilya.ilya.HW9;

public final class Tools {

    private Tools() {
    }

    /**
     * Поиск сотрудника в массиве по его имени
     */
    public static Employee findEmployee(Employee[] employees, String name) {
        if (employees == null || name == null) return null;
        for (Employee employee : employees) {
            if (employee != null
                    && employee.getName() != null
                    && employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        System.out.println("Сотрудник не найден в списке");
        return null;
    }

    /**
     * Поиск сотрудника в массиве по вхождению указанной строки в его имени
     */
    public static Employee findEmployeeByPartName(Employee[] employees, String partName) {
        if (employees == null || partName == null) return null;
        for (Employee employee : employees) {
            if (employee != null
                    && employee.getName() != null
                    && employee.getName().toLowerCase().contains(partName.toLowerCase())) {
                return employee;
            }
        }
        System.out.println("Сотрудник не найден в списке");
        return null;
    }

    /**
     * Подсчет зарплатного бюджета для всех сотрудников в массиве
     */
    public static int calculateBudget(Employee[] employees) {
        int budget = 0;
        boolean found = false;
        if (employees == null) {
            System.out.println("Массив сотрудников не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Employee employee : employees) {
            if (employee != null) {
                budget += employee.getSalary();
            }
            found = true;
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return budget;
    }

    /**
     * Поиск наименьшей зарплаты в массиве
     */
    public static int findMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        boolean found = false;
        if (employees == null) {
            System.out.println("Массив сотрудников не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return minSalary;
    }

    /**
     * Поиск наименьшей зарплаты в массиве
     */
    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        boolean found = false;
        if (employees == null) {
            System.out.println("Массив сотрудников не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return maxSalary;
    }

    /**
     * Поиск наименьшего количества подчиненных в массиве менеджеров
     */
    public static int findMinSubordinates(Manager[] managers) {
        int minSubordinates = Integer.MAX_VALUE;
        boolean found = false;
        if (managers == null) {
            System.out.println("Массив менеджеров не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Manager manager : managers) {
            if (manager != null) {
                if (manager.getNumberOfSubordinates() < minSubordinates) {
                    minSubordinates = manager.getNumberOfSubordinates();
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return minSubordinates;
    }

    /**
     * Поиск наибольшего количества подчиненных в массиве менеджеров
     */
    public static int findMaxSubordinates(Manager[] managers) {
        int maxSubordinates = Integer.MIN_VALUE;
        boolean found = false;
        if (managers == null) {
            System.out.println("Массив менеджеров не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Manager manager : managers) {
            if (manager != null) {
                if (manager.getNumberOfSubordinates() > maxSubordinates) {
                    maxSubordinates = manager.getNumberOfSubordinates();
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return maxSubordinates;
    }

    /**
     * Поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
     */
    public static int findMaxBonus(Manager[] managers) {
        int maxBonus = Integer.MIN_VALUE;
        boolean found = false;
        if (managers == null) {
            System.out.println("Массив менеджеров не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Manager manager : managers) {
            if (manager != null) {
                int bonus = manager.getSalary() - manager.getBaseSalary();
                if (bonus > maxBonus) {
                    maxBonus = bonus;
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return maxBonus;
    }

    /**
     * Поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
     */
    public static int findMinBonus(Manager[] managers) {
        int minBonus = Integer.MAX_VALUE;
        boolean found = false;
        if (managers == null) {
            System.out.println("Массив менеджеров не может быть null");
            return -1; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -1
        }
        for (Manager manager : managers) {
            if (manager != null) {
                int bonus = manager.getSalary() - manager.getBaseSalary();
                if (bonus < minBonus) {
                    minBonus = bonus;
                }
                found = true;
            }
        }
        if (!found) {
            System.out.println("В массиве нет сотрудников");
            return -2; //На текущий момент в лекциях не проходили throw new Exception(), реализовано как return -2
        }
        return minBonus;
    }
}



