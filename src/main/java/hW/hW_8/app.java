package hW.hW_8;
import  hW.hW_8.helper.*;
import hW.hW_8.helper.EmployeeUtility;

import static hW.hW_8.helper.EmployeeUtility.*;
import static hW.hW_8.helper.*;
//import static hW.hW_8.helper.EmployeeUtility.findEmployeeByName;
//import static hW.hW_8.helper.EmployeeUtility.findEmployeeBySubstring;

public class app {
    public static void main(String[] args) {
        Employee employee100 = new Employee("Иван", 50000);
        System.out.println("Имя: " + employee100.getName());
        System.out.println("Базовая ставка: " + employee100.getBaseSalary());
        System.out.println("Зарплата: " + employee100.getSalary());

        // Изменение базовой ставки и имени
        employee100.setBaseSalary(55000);
        employee100.setName("Петр");

        System.out.println("Имя: " + employee100.getName());
        System.out.println("Новая базовая ставка: " + employee100.getBaseSalary());
        System.out.println("Новая зарплата: " + employee100.getSalary());


//
        System.out.println("========================MANAGERS================================");
        Manager manager = new Manager("Bob",55000,10);
        System.out.println(manager.getSalary());
        manager.setBaseSalary(100000);
        System.out.println(manager.getSalary());
        manager.setNumberOfSubordinates(5);
        System.out.println(manager.getSalary());
        Manager john = new Manager("John", 60000, 3);
        Manager mary = new Manager("Mary", 55000, 7);
        Manager michael = new Manager("Michael", 62000, 1);

        System.out.println("========================Test.Director================================");

        Employee[] employees = new Employee[15];
        employees[0] = new Director("John",100000,14);
        employees[1] = new Employee("Mary", 55000);
        employees[2] = new Employee("Michael", 62000);
        employees[3] = new Employee("Jennifer", 58000);
        employees[4] = new Manager("William", 59000,2);
        employees[5] = new Employee("Elizabeth", 57000);
        employees[6] = new Employee("James", 61000);
        employees[7] = new Manager("Linda", 54000,5);
        employees[8] = new Employee("David", 63000);
        employees[9] = new Employee("Patricia", 56000);
        employees[10] = new Employee("Richard", 64000);
        employees[11] = new Employee("Susan", 55000);
        employees[12] = new Employee("Joseph", 62000);
        employees[13] = new Employee("Jessica", 57000);
        employees[14] = new Manager("Charles", 61000,4);

        System.out.println(employees[0].getSalary());
        System.out.println(employees[0].getSalary());
        System.out.println(employees[7].getSalary());

        /**
         * выз клвсс
         * */
        System.out.println(employees[0].getClass());
        System.out.println(employees[0]instanceof Director);
        System.out.println(employees[0]instanceof Employee);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test.Manager>>>>>>>>>>>>>>>>>>>>>>");

        for (int  i = 0; i < employees.length ; i++) {
            if ( employees[i].getClass().toString().equals("class hW.hW_8.Test.Manager")){
                System.out.println(employees[i].getName());
            }


        }

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");



        System.out.println(findEmployeeByName(employees,"John"));
        System.out.println(findEmployeeBySubstring(employees,  "Mar"));
        System.out.println(findMinSalary(employees));





    }

}
