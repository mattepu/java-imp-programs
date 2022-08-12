package com.steams.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 5, 5,3);
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


        ////////// List Of Emplpoyee Objects ///////////
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("B", 100));
        employeeList.add(new Employee("A", 101));
        employeeList.add(new Employee("C", 10));
        Map<String, Integer> collect1 = employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(collect1);

        List<String> names = Arrays.asList("mahesh", "uma", "parnitha", "uma");

        Map<String, Integer> collect2 = names.stream().distinct().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(collect2);
    }
}
