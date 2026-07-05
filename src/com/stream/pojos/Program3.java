package com.stream.pojos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {

        Employee emp = new Employee("Sai", "HR", 45000, "Male", LocalDate.of(2010, 5, 05));
        Employee emp2 = new Employee("Krishna", "Accounting", 45000, "Male", LocalDate.of(2012, 2, 02));
        Employee emp3 = new Employee("Anusha", "IT", 60000, "Female", LocalDate.of(2019, 9, 23));
        Employee emp4 = new Employee("Ashok", "IT", 50000, "Male", LocalDate.of(2013, 5, 20));

        List<Employee> employees = Arrays.asList(emp, emp2, emp3, emp4);

        // maximum salary employee

        Employee high = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(high);

        //min salary employee

        Employee low = employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(low);

    }

}