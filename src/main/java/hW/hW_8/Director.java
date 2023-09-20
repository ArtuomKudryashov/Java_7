package hW.hW_8;

public class Director extends Manager {

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }





    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return baseSalary + (baseSalary * getNumberOfSubordinates() * 0.09);
        } else {
            return baseSalary;
        }
    }
}
