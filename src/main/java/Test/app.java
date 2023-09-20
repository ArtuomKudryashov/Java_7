package Test;

import static Test.Utilit.*;

//import Group.Test;


public class app {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.setBaseSalary(100);
        //System.out.println(w1.getSalary());

        Manager m1 = new Manager();
        m1.setBaseSalary(1000);
        m1.NumberOfSubordinates = 2;
        //System.out.println(m1.getSalary());

        Director d1 = new Director();
        d1.setBaseSalary(5000);
        d1.NumberOfSubordinates = 100;
        // System.out.println(d1.getSalary());

        Director d2 = new Director();
        d2.name = "Zhenya";
        d2.BaseSalary = 100;

        Manager m2 = new Manager();
        m2.name = "Lesha";
        m2.BaseSalary = 500;

        Employee[] rabotn = new Employee[] {d2, m2};


        System.out.println( minZP(rabotn));
        System.out.println(findName(rabotn, "Tima"));
        System.out.println(Test.Utilit.findName(rabotn,"Nick"));














    }

}

