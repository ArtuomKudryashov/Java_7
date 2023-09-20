package hW.hw_7;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private double salary;

    public Employee(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public boolean isSameName(Employee employee) {
        return this.name.equals(employee.getName());
    }

    public double getSalary() {
        return  salary;
    }


}



