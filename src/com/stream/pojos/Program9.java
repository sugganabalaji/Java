package com.stream.pojos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program9 {

    public static void main(String[] args) {

        Employee emp = new Employee("Sai", "HR", 45000, "Male", LocalDate.of(2010, 5, 05));
        Employee emp2 = new Employee("Krishna", "Accounting", 45000, "Male", LocalDate.of(2012, 2, 02));
        Employee emp3 = new Employee("Anusha", "IT", 60000, "Female", LocalDate.of(2019, 9, 23));
        Employee emp4 = new Employee("Ashok", "IT", 50000, "Male", LocalDate.of(2013, 5, 20));

        List<Employee> employees = Arrays.asList(emp, emp2, emp3, emp4);

        // average salary of male and female

        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

        // total sum and average salary
        DoubleSummaryStatistics summaryStatistics = employees.stream()
                .map(n -> n.getSalary())
                .mapToDouble(n->n)
                .summaryStatistics();

        System.out.println(summaryStatistics);
    }

}