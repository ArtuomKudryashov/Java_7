package hW.hw_7;

public class app {
    public static void main(String[] args) {
        Person person = new Person("Artuom",15,"Мужской");
        Person person2 = new Person("Елена", 25, "Женский");
        Person person3 = new Person("Алекс", 22, "Другой");
        person.getName();
        System.out.println(person.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
//        person.name= "Artuom";
//        person.gender="Мужской";
//        person.age=28;

        Employee george = new Employee("George", 30, "Мужской", 50000);
        Employee елена= new Employee("Елена", 25, "Женский", 60000);

        System.out.println(george.isSameName(елена));  // Вывод: false

        Employee nick = new Employee("George", 28, "Мужской", 55000);

        System.out.println(george.isSameName(nick));  // Вывод: true

        Employee employee1 = new Employee("John", 30, "Мужской", 50000);
        Employee employee2 = new Employee("Emily", 25, "Женский", 60000);
        Employee employee3 = new Employee("Michael", 40, "Мужской", 55000);
        Employee employee4 = new Employee("Jessica", 28, "Женский", 48000);
        Employee employee5 = new Employee("William", 22, "Мужской", 45000);
        Employee employee6 = new Employee("Sophia", 29, "Женский", 52000);
        Employee employee7 = new Employee("David", 35, "Мужской", 58000);
        Employee employee8 = new Employee("Olivia", 27, "Женский", 51000);
        Employee employee9 = new Employee("Daniel", 32, "Мужской", 53000);
        Employee employee10 = new Employee("Emma", 24, "Женский", 49000);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5,
                employee6, employee7, employee8, employee9, employee10};
        double [] salaries = new double[employees.length];
        for (int i = 0; i < employees.length; i++) {
            salaries[i] = employees[i].getSalary();


        }
        for (double salary : salaries) {
            System.out.println(salary);
        }


        Salary salarySum = new Salary();
        salarySum.getSum(employees);
        System.out.println("Сумма зарплат всех сотрудников: " + salarySum.getSum(employees));

    }




}
