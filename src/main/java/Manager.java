public class Manager extends Employee {
    int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int NumberOfSubordinates) {
        this.NumberOfSubordinates = NumberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + (getBaseSalary() * NumberOfSubordinates * 3 / 100);
    }
}