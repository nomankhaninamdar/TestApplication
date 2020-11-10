package com.noman.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpoyeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<Employee>();
		
		Employee e1= new Employee("e1", 1,140000,"IT");
		
		Employee e2= new Employee("e2", 2,120000,"IT");
		
		Employee e3= new Employee("e3", 3,130000,"IT");
		
		Employee e4= new Employee("e4", 4,160000,"IT");
		
		
		
		Employee e5  = new Employee("e5",5,30000,"Comp");
		
		Employee e6  = new Employee("e6",6,40000,"Electrical");
		
		Employee e7  = new Employee("e7",7,50000,"Electrical");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		
		
		employees.stream().filter(e->e.salary>30000 ).forEach(System.out::println);
		
		employees.stream().map(Employee::getName).forEach(System.out::println);
		
		employees.stream().map(Employee::getSalary).forEach(System.out::println);
		
		Map<String, List<Employee>> empByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(empByDept);
		
		
		employees.stream().filter(e-> e.dept== "IT").map(Employee :: getDept).forEach(System.out::println);
		
		employees.stream().collect(Collectors.groupingBy(Employee:: getDept,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get)));
	}

}
