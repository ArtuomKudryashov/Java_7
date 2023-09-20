package hW.hW_8;

public class Employee {
    public String name;
    public double baseSalary;


    public Employee( String name,double baseSalary) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  double getSalary(){
        return baseSalary;
    }

}
