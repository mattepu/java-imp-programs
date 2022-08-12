package com.steams.duplicates;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementGroupingByFunction {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,3,5,5,5,6,6,6);
        Map<Integer, Long> collect = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        /////////////////

        Employee employee = new Employee("Mahesh", 5000);
        Employee employee1 = new Employee("Parnitha", 1000);
        Employee employee2 = new Employee("Mahesh", 6000);
        Employee employee3 = new Employee("Parnitha", 4000);
        Employee employee4 = new Employee("Anitha", 3000);
        Employee employee5 = new Employee("Lalith", 2000);

        List<Employee> employeelist = new ArrayList<Employee>();
        employeelist.add(employee);
        employeelist.add(employee1);employeelist.add(employee2);
        employeelist.add(employee3);employeelist.add(employee4);employeelist.add(employee5);

        List<String> collect1 = employeelist.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("Employe names " + collect1);//get employee names only
        Set<String> collect2 = employeelist.stream().map(e -> e.getName()).collect(Collectors.toSet());
        System.out.println("Eployee names with out duplicates " + collect2);
        Set<String> duplicates = new HashSet<>();

        // get the duplicate names from the employee list
        Set<String> collect3 = employeelist.stream().map(e -> e.getName()).collect(Collectors.toList()).stream().filter(name -> !duplicates.add(name)).collect(Collectors.toSet());

        System.out.println(collect3);

        //get the highest salary from the employee list
        Integer integer = employeelist.stream().map(e -> e.getSalary()).collect(Collectors.toList()).stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println("Highest Salary " + integer);
    }
}
