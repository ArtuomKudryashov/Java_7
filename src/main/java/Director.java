public class Director extends Manager {

    @Override
    public double getSalary() {
        return getBaseSalary() + (getBaseSalary() * NumberOfSubordinates / 100 * 9);
    }
}