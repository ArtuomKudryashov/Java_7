package hW.hW_8;

public class helper {
    public class EmployeeUtility {
        // Метод для поиска сотрудника по имени
        public static String findEmployeeByName(Employee[] employees, String name) {
            for (Employee employee : employees) {
                if (employee.getName().equals(name)) {
                    return employee.getName();
                }
            }
            return null; // Сотрудник с указанным именем не найден
        }

        // Метод для поиска сотрудника по вхождению строки в его имени
        public static String findEmployeeBySubstring(Employee[] employees, String substring) {
            for (Employee employee : employees) {
                if (employee.getName().contains(substring)) {
                    return employee.getName();
                }
            }
            return null; // Сотрудник с указанной подстрокой в имени не найден
        }

        // Метод для подсчета зарплатного бюджета для всех сотрудников
        public static double calculateTotalSalary(Employee[] employees) {
            double totalSalary = 0;
            for (Employee employee : employees) {
                totalSalary += employee.getSalary();
            }
            return totalSalary;
        }

        // Методы для поиска наименьшей и наибольшей зарплаты
        public static double findMinSalary(Employee[] employees) {
            double minSalary = Double.MAX_VALUE;
            for (Employee employee : employees) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                }
            }
            return minSalary;
        }

        public static double findMaxSalary(Employee[] employees) {
            double maxSalary = Double.MIN_VALUE;
            for (Employee employee : employees) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                }
            }
            return maxSalary;
        }

        // Методы для поиска наименьшего и наибольшего количества подчиненных у менеджеров
        public static int findMinSubordinatesCount(Manager[] managers) {
            int minSubordinates = Integer.MAX_VALUE;
            for (Manager manager : managers) {
                if (manager.getNumberOfSubordinates() < minSubordinates) {
                    minSubordinates = manager.getNumberOfSubordinates();
                }
            }
            return minSubordinates;
        }

        public static int findMaxSubordinatesCount(Manager[] managers) {
            int maxSubordinates = Integer.MIN_VALUE;
            for (Manager manager : managers) {
                if (manager.getNumberOfSubordinates() > maxSubordinates) {
                    maxSubordinates = manager.getNumberOfSubordinates();
                }
            }
            return maxSubordinates;
        }

        // Методы для поиска наибольшей и наименьшей надбавки у менеджеров
        public static double findMaxSalaryIncrease(Manager[] managers) {
            double maxSalaryIncrease = Double.MIN_VALUE;
            for (Manager manager : managers) {
                double salaryIncrease = manager.getSalary() - manager.getBaseSalary();
                if (salaryIncrease > maxSalaryIncrease) {
                    maxSalaryIncrease = salaryIncrease;
                }
            }
            return maxSalaryIncrease;
        }

        public static double findMinSalaryIncrease(Manager[] managers) {
            double minSalaryIncrease = Double.MAX_VALUE;
            for (Manager manager : managers) {
                double salaryIncrease = manager.getSalary() - manager.getBaseSalary();
                if (salaryIncrease < minSalaryIncrease) {
                    minSalaryIncrease = salaryIncrease;
                }
            }
            return minSalaryIncrease;
        }
    }
}
