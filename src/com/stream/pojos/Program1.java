package com.stream.pojos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) {
        Employee emp = new Employee("Sai", "HR", 45000, "Male", LocalDate.of(2010, 5, 05));
        Employee emp2 = new Employee("Krishna", "Accounting", 45000, "Male", LocalDate.of(2012, 2, 02));
        Employee emp3 = new Employee("Anusha", "IT", 60000, "Female", LocalDate.of(2019, 9, 23));
        Employee emp4 = new Employee("Ashok", "IT", 50000, "Male", LocalDate.of(2013, 5, 20));

        List<Employee> employees = Arrays.asList(emp, emp2, emp3, emp4);

        // male and female

        long mCount = employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .count();

        System.out.println(mCount);

        long fCount = employees.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .count();

        System.out.println(fCount);

        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(collect);

    }

}