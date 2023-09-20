package Test;

public abstract class Employee {
    double BaseSalary;
    String name;

    public double getBaseSalary() {

        return BaseSalary;
    }

    public void setBaseSalary (int BaseSalary) {

        this.BaseSalary = BaseSalary;
    }

    public String getName(){
        return name;
    };

    public void setName(String name) {

        this.name = name;
    }
    public abstract double getSalary();

}
