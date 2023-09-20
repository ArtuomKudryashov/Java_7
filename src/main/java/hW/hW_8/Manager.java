package hW.hW_8;

public class Manager extends Worker{
    private int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates=numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public double getSalary() {
        if (numberOfSubordinates > 0) {
            return baseSalary + (baseSalary * numberOfSubordinates * 0.03);
        } else {
            return baseSalary;
        }
    }
}
