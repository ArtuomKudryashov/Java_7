package hW.hw_7;

public class Salary {
    public  double getSum(Employee[] employeeArray){
        double sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum = sum + employeeArray[i].getSalary();


        }
        return sum;
    }

}
